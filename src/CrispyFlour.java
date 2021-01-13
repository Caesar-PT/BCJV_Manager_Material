import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount, PriceDifference{
    private double quantity;

    public CrispyFlour withId(String id) {
        this.setId(id);
        return this;
    }

    public CrispyFlour withName(String name){
        this.setName(name);
        return this;
    }

    public CrispyFlour withManufacturingDate(LocalDate manufacturingDate){
        this.setManufacturingDate(manufacturingDate);
        return this;
    }

    public CrispyFlour withCost(int cost){
        this.setCost(cost);
        return this;
    }

    public CrispyFlour withQuantify(double quantify) {
        this.setQuantity(quantify);
        return this;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity * getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusYears(1);
    }

    @Override
    public double getRealMoney() {
            if (LocalDate.now().plusMonths(4).isAfter(getExpiryDate())){
                return getAmount() * 0.8;
            } else if (LocalDate.now().plusMonths(2).isAfter(getExpiryDate())){
                return getAmount() * 0.6;
            } else
                return getAmount() * 0.95;
    }

    @Override
    public double getPriceDifference() {
        return getAmount() - getRealMoney();
    }
}

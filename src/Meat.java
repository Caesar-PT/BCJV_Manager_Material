import java.time.LocalDate;

public class Meat extends Material implements Discount, PriceDifference{
    private double weight;

    public Meat(){
    }

    public Meat withId(String id){
        this.setId(id);
        return this;
    }

    public Meat withName(String name){
        this.setName(name);
        return this;
    }

    public Meat withManufacturingDate(LocalDate manufacturingDate) {
        this.setManufacturingDate(manufacturingDate);
        return this;
    }

    public Meat withCost(int cost){
        this.setCost(cost);
        return this;
    }

    public Meat withWeight(double weight){
        this.setWeight(weight);
        return this;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public double getAmount() {
        return weight*getCost();
    }

    @Override
    public LocalDate getExpiryDate() {
        return getManufacturingDate().plusDays(7);
    }

    @Override
    public double getRealMoney() {
        if (LocalDate.now().plusDays(5).isAfter(getExpiryDate())){
            return getAmount() * 0.7;
        } else if (LocalDate.now().plusDays(3).isAfter(getExpiryDate())){
            return getAmount() * 0.5;
        } else
            return getAmount() * 0.9;
    }

    @Override
    public double getPriceDifference() {
        return getAmount() - getRealMoney();
    }
}

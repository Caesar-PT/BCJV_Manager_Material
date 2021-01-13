import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        ManagerMaterial manager = new ManagerMaterial();

        Meat meat1 = new Meat().withId("1").withName("Thịt Bò").withManufacturingDate(LocalDate.of(2020, 12, 30)).withCost(5000).withWeight(2);
        Meat meat2 = new Meat().withId("2").withName("Thịt Lợn").withManufacturingDate(LocalDate.of(2021, 1, 10)).withCost(6000).withWeight(3);
        Meat meat3 = new Meat().withId("3").withName("Thịt Gà").withManufacturingDate(LocalDate.of(2020, 1, 3)).withCost(7000).withWeight(4);
        Meat meat4 = new Meat().withId("4").withName("Thịt Cá Sấu").withManufacturingDate(LocalDate.of(2021, 1, 1)).withCost(8000).withWeight(5);
        Meat meat5 = new Meat().withId("5").withName("Thịt Chó").withManufacturingDate(LocalDate.of(2021, 1, 9)).withCost(9000).withWeight(6);

        manager.addMeat(meat1);
        manager.addMeat(meat2);
        manager.addMeat(meat3);
        manager.addMeat(meat4);
        manager.addMeat(meat5);

        System.out.println(meat1.getAmount());
        System.out.println(meat1.getRealMoney());
        System.out.println(meat1.getPriceDifference());
    }
}

import java.util.ArrayList;
import java.util.List;

public class ManagerMaterial {
    List<Meat> meatList = new ArrayList<>();
    List<CrispyFlour> crispyFlourList = new ArrayList<>();

    public void addMeat(Meat meat){
       meatList.add(meat);
    }

    public void addFlourList(CrispyFlour crispyFlour){
        crispyFlourList.add(crispyFlour);
    }
}

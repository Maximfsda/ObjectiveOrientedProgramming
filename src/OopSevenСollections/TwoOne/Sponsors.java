package OopSevenСollections.TwoOne;

public class Sponsors {

    private final String name;
    private int supportAmount;

    public Sponsors(String name, int supportAmount) {
        this.name = name;
        setSupportAmount(supportAmount);
    }

    public String getName() {
        return name;
    }

    public int getSupportAmount() {
        return supportAmount;
    }

    public void setSupportAmount(int supportAmount) {
        this.supportAmount = supportAmount;

    }

    public String toSponsors (){
        System.out.print(getName()+" проспонсировал заезд на "+getSupportAmount());
        return " ";
    }
}

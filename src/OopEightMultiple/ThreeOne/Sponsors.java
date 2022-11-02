package OopEightMultiple.ThreeOne;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Sponsors sponsors = (Sponsors) o;
        return supportAmount == sponsors.supportAmount && Objects.equals(name, sponsors.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, supportAmount);
    }
}

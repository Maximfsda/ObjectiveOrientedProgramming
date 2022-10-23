package OopThree1;

public class Bus extends Trasnsport {

    public Bus(String mark, String model, int yearRelease, String issuingCountry, String colorBody, int maxSpeed, String reefill) {
        super(mark, model, yearRelease, issuingCountry, colorBody, maxSpeed,reefill);
    }

    @Override
    public void refill() {
         String reefill = "Можно заправлять бензином, дизелем на заправке ";
         this.setReefilli(reefill);

    }
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

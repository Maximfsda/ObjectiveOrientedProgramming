package OopThree1;

public class Bus extends Trasnsport {

    public Bus(String mark, String model, int yearRelease, String issuingCountry, String colorBody, int maxSpeed, String reefill) {
        super(mark, model, yearRelease, issuingCountry, colorBody, maxSpeed,reefill);
    }

    @Override
    public void refill() {
         String reefill = "Можно заправлять бензином, дизелем на заправке ";
         this.setReefill(reefill);

    }
}

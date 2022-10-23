package OopThree1;

public class Train extends Trasnsport {
    private int tripPrice;
    private int travelTime;
    private String nameDepartureStation;
    private String finalStop;
    private int numberWagons;

    public Train(String mark, String model, int yearRelease, String issuingCountry, String colorBody, int maxSpeed,String reefill) {
        super(mark, model, yearRelease, issuingCountry, colorBody, maxSpeed,reefill);
    }

    public Train(String mark,
                 String model,
                 int yearRelease,
                 String issuingCountry,
                 String colorBody,
                 int maxSpeed,
                 int tripPrice,
                 int travelTime,
                 String nameDepartureStation,
                 String finalStop,
                 int numberWagons,
                 String reefill) {
        super(mark, model, yearRelease, issuingCountry, colorBody, maxSpeed,reefill);
        setTripPrice(tripPrice);
        setTravelTime(travelTime);
        setNameDepartureStation(nameDepartureStation);
        setFinalStop(finalStop);
        setNumberWagons(numberWagons);
    }

    public int getTripPrice() {
        return tripPrice;
    }

    public void setTripPrice(int tripPrice) {
        this.tripPrice = tripPrice > 0 ? tripPrice : 0;
    }

    public int getTravelTime() {
        return travelTime;
    }

    public void setTravelTime(int travelTime) {
        this.travelTime = travelTime > 0 ? travelTime : 1;
    }

    public String getNameDepartureStation() {
        return nameDepartureStation;
    }

    public void setNameDepartureStation(String nameDepartureStation) {
        this.nameDepartureStation = nameDepartureStation == null || nameDepartureStation.isEmpty() ? "Некорректный ввод." : nameDepartureStation;
    }

    public String getFinalStop() {
        return finalStop;
    }

    public void setFinalStop(String finalStop) {
        this.finalStop = finalStop == null || finalStop.isEmpty() ? "Некорректный ввод." : finalStop;
    }

    public int getNumberWagons() {
        return numberWagons;
    }

    public void setNumberWagons(int numberWagons) {
        this.numberWagons = numberWagons > 0 ? numberWagons : 1;
    }

    @Override
    public String toString() {
        return "Поезд " + getMark() + "," +
                "модель " + getModel() + "," +
                "год выпуска " + getYearRelease() +
                " в " + getIssuingCountry() + "," +
                "скорость передвижения -" + getMaxSpeed() + "км/ч," +
                getNameDepartureStation() + getFinalStop() +
                ", цена поездки -" + getTripPrice() + "руб" +
                ", в поезде " + numberWagons + " вагонов. " +
                getReefill();
    }

    @Override
    public void refill() {
        String reefill = " Можно заправлять дизелем на заправке. ";
        this.setReefill(reefill);

    }
}

package OopThree1;

import java.util.Objects;

public  abstract class Trasnsport {

    private final String mark;
    private final String model;
    private final int yearRelease;
    private final String issuingCountry;
    private final String colorBody;
    private final int maxSpeed;
    private String reefilli;

    public Trasnsport(String mark, String model, int yearRelease, String issuingCountry, String colorBody, int maxSpeed,String reefilli) {
        this.mark = mark;
        this.model = model;
        this.yearRelease = yearRelease;
        this.issuingCountry = issuingCountry;
        this.colorBody = colorBody;
        this.maxSpeed = maxSpeed;
        this.reefilli = reefilli;
    }

    public String getMark() {
        return mark;
    }

    public String getModel() {
        return model;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public String getIssuingCountry() {
        return issuingCountry;
    }

    public String getColorBody() {
        return colorBody;
    }


    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getReefill() {
        return reefilli;
    }

    public void setReefilli(String reefilli) {
        this.reefilli = reefilli;
    }

    @Override
    public String toString() {
        return
                "Марка " + mark + ',' +
                " модель " + model + ',' +
                " год выпуска " + yearRelease +
                " страна выпуска " + issuingCountry + ',' +
                " цвет " + colorBody + ',' +
                " скорость движения " + maxSpeed +
                "км/ч." + getReefill();
    }
    public abstract void refill();

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trasnsport that = (Trasnsport) o;
        return yearRelease == that.yearRelease && maxSpeed == that.maxSpeed && Objects.equals(mark, that.mark) && Objects.equals(model, that.model) && Objects.equals(issuingCountry, that.issuingCountry) && Objects.equals(colorBody, that.colorBody) && Objects.equals(reefilli, that.reefilli);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, model, yearRelease, issuingCountry, colorBody, maxSpeed, reefilli);
    }
}

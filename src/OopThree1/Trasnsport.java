package OopThree1;

public  abstract class Trasnsport {

    private String mark;
    private String model;
    private final int yearRelease;
    private final String issuingCountry;
    private String colorBody;
    private int maxSpeed;
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

    public void setMark(String mark) {
        this.mark = mark == null || mark.isEmpty() ? "Некорректный ввод." : mark;
    }

    public void setModel(String model) {
        this.model = model == null || model.isEmpty() ? "Некорректный ввод." : model;
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

    public void setColorBody(String colorBody) {
        this.colorBody = colorBody == null || colorBody.isEmpty() ? "Некорректный ввод." : colorBody;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed > 0 ? maxSpeed : 0;
    }

    public String getReefill() {
        return reefilli;
    }

    public void setReefill(String reefill) {
        this.reefilli = reefill == null || reefill.isEmpty() ? "Некорректный ввод." : reefill;
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

}

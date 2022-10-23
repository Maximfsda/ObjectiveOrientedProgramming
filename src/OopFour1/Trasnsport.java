package OopFour1;

public  abstract class Trasnsport {

    private String mark;
    private String model;
    private double engineCapacity;

    public Trasnsport(String mark, String model, double engineCapacity) {
        this.mark = mark;
        this.model = model;
        this.engineCapacity = engineCapacity;
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

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity > 0.0 ? engineCapacity : 1.5;
    }
    public abstract void getMoving();
    public abstract void finishMoving();
    @Override
    public String toString() {
        return
                "Марка " + mark + ',' +
                        " модель " + model + ',' +
                        " обьем двигателя " + engineCapacity + '.';
    }
}

package OopSevenСollections.OneOne;

import OopSevenСollections.OneOne.Transport.Driver;

import java.util.ArrayList;
import java.util.List;

public abstract class Trasnsport {

    private String mark;
    private String model;
    private double engineCapacity;

    private List<Driver<?>> drivers = new ArrayList<>();
    private List<Mehanic<?>> mehanics = new ArrayList<>();
    private List<Sponsors> sponsors = new ArrayList<>();

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

    public List<Driver<?>> getDrivers() {
        return drivers;
    }

    public List<Mehanic<?>> getMehanics() {
        return mehanics;
    }

    public List<Sponsors> getSponsors() {
        return sponsors;
    }

    public void addDriver(Driver<?> driver){
        drivers.add(driver);
    }
    public void addMehanic(Mehanic<?> mehanic){
        mehanics.add(mehanic);
    }
    public void addSponsor(Sponsors sponsor){
        sponsors.add(sponsor);
    }


    public abstract void getMoving();
    public abstract void finishMoving();

    public abstract boolean servise();
    public abstract void repair();

    @Override
    public String toString() {
        return
                "Марка " + mark + ',' +
                        " модель " + model + ',' +
                        " обьем двигателя " + engineCapacity + '.';
    }


}

package OopEightMultiple.ThreeOne;

import OopEightMultiple.ThreeOne.Transport.Driver;

import java.util.*;

public abstract class Trasnsport {

    private String mark;
    private String model;
    private double engineCapacity;

    private Set<Driver<?>> drivers = new HashSet<>();
    private Set<Mehanic<?>> mehanics = new HashSet<>();
    private Set<Sponsors> sponsors = new HashSet<>();

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

    public Set<Driver<?>> getDrivers() {
        return drivers;
    }

    public Set<Mehanic<?>> getMehanics() {
        return mehanics;
    }

    public Set<Sponsors> getSponsors() {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Trasnsport that = (Trasnsport) o;
        return Double.compare(that.engineCapacity, engineCapacity) == 0 && Objects.equals(mark, that.mark) && Objects.equals(model, that.model) && Objects.equals(drivers, that.drivers) && Objects.equals(mehanics, that.mehanics) && Objects.equals(sponsors, that.sponsors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mark, model, engineCapacity, drivers, mehanics, sponsors);
    }

    @Override
    public String toString() {
        return
                "Марка " + mark + ',' +
                        " модель " + model + ',' +
                        " обьем двигателя " + engineCapacity + '.';
    }


}

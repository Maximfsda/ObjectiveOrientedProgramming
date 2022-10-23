package OopFour1.Transport;

import OopFour1.Trasnsport;

public abstract class Driver<A extends Trasnsport> {

    private final String nameDriver;
    private final String driverLicenceCategory;
    private final int experience;

    private final A car;

    public Driver(String nameDriver, String driverLicenceCategory, int experience, A car) {
        this.nameDriver = nameDriver;
        this.driverLicenceCategory = driverLicenceCategory;
        this.experience = experience;
        this.car = car;
    }

    public String getNameDriver() {
        return nameDriver;
    }

    public String getDriverLicenceCategory() {
        return driverLicenceCategory;
    }

    public int getExperience() {
        return experience;
    }

    public void gettingStarted() {
        System.out.printf("Водитель %s начинает движение", this.nameDriver);
        this.car.getMoving();


    }

    public void Stop() {
        System.out.printf("Водитель %s останавливает движение", this.nameDriver);
        this.car.finishMoving();

    }

    public void fuellingTheCar() {
        System.out.printf("Водитель %s заправляет машину %s %s", this.nameDriver, this.car.getMark(), this.car.getModel());

    }

    @Override
    public String toString() {
        return String.format("Водитель %s управляет автомобилем %s %s и будет учавствовать в заезде"
                ,this.nameDriver, this.car.getMark(), this.car.getModel());
    }
}

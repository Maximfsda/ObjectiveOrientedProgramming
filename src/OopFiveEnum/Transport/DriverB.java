package OopFiveEnum.Transport;

import OopFiveEnum.Car;

public class DriverB extends Driver<Car> {
    public DriverB(String nameDriver, int experience, Car car) {
        super(nameDriver, "B", experience, car);
    }
}

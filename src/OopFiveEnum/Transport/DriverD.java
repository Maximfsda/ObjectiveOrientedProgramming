package OopFiveEnum.Transport;

import OopFiveEnum.Bus;

public class DriverD extends Driver<Bus> {
    public DriverD(String nameDriver, int experience, Bus car) {
        super(nameDriver, "D", experience, car);
    }
}

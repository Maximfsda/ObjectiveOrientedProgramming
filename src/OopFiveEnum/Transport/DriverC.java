package OopFiveEnum.Transport;

import OopFiveEnum.Truks;

public class DriverC extends Driver<Truks> {
    public DriverC(String nameDriver, int experience, Truks car) {
        super(nameDriver, "C", experience, car);
    }
}

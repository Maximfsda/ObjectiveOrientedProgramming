package OopEightMultiple.ThreeOne;

import OopEightMultiple.ThreeOne.Transport.Driver;
import OopEightMultiple.ThreeOne.Transport.DriverB;
import OopEightMultiple.ThreeOne.Transport.DriverC;
import OopEightMultiple.ThreeOne.Transport.DriverD;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car audi = new Car("Audi", "Q7", 2.5);
        Car uaz = new Car("UAZ", "Патриот", 2.0);
        System.out.println(audi);
        System.out.println(uaz);
        System.out.println();

        Truks gaz = new Truks("Газ","543",7.0);
        Truks ural = new Truks("Урал","2-901",6.3);
        System.out.println(gaz);
        System.out.println(ural);
        System.out.println();
        Bus maz = new Bus("МАЗ","324",5.6);
        Bus nefaz = new Bus("НЕФАЗ","3-1",6.5);

        System.out.println(maz);
        System.out.println(nefaz);
        System.out.println();
        audi.pitStop("Топливо");
        audi.bestLapTimeEver(1.4,2.4,3.4,0.1);
        gaz.maxSpeed(1,556,34);


        Car car = new Car("Toyota","Korsa",1.7);
//        DriverB driver = new DriverB("Вася","B",3,car);
//        System.out.println(driver);

        //Задание N1 -Collections
        Sponsors oooFinans = new Sponsors("OOO Finans", 3_000_000);
        Sponsors viktor = new Sponsors("Viktor", 20_000);
        Sponsors model = new Sponsors("Model", 300_000);

        Car lada = new Car("Lada", "Granta", 1.7);
        lada.addDriver(new DriverB("Вася"," B ",3,lada));
        lada.addMehanic(new Mehanic<Car>("Гарик","Мартирасян","ComedyAuto"));
        lada.addSponsor(oooFinans);

        Truks camaz = new Truks("Камаз","B-901",6.7);
        camaz.addDriver(new DriverC("Ольга","C",2,camaz));
        camaz.addMehanic(new Mehanic<Truks>("Женя","Паровоз","OOO Tlen"));
        camaz.addSponsor(oooFinans);
        camaz.addSponsor(viktor);

        Bus olimp = new Bus("ОЛИМП","20-1",5.4);
        olimp.addDriver(new DriverD("Ричард","D",6,olimp));
        olimp.addMehanic(new Mehanic<Car>("Курук","Борик","HDO"));
        olimp.addSponsor(oooFinans);
        olimp.addSponsor(model);

        ServiseStation serviseStation = new ServiseStation();
        serviseStation.addCarr(lada);
        serviseStation.addTruck(camaz);
        serviseStation.servise();
        serviseStation.servise();

        List<Trasnsport> trasnsports = List.of(lada,camaz,olimp);
        for (Trasnsport  trasnsport: trasnsports) {
            printInfo(trasnsport);
        }

    }
    private static void printInfo(Trasnsport transport){
        System.out.println("Информация по авто - "+ transport.getMark() +" "+ transport.getModel());
        System.out.println("Водители:");
        for(Driver<?> driver : transport.getDrivers()){
            System.out.println(driver.fio());
        }
        System.out.println("Спонсоры:");
        for(Sponsors sponsors : transport.getSponsors()){
            System.out.println(sponsors.toSponsors());
        }
        System.out.println("Механики:");
        for(Mehanic<?> mehanic : transport.getMehanics()){
            System.out.println(mehanic.getName() + " "+ mehanic.getSurname() + " из компании " + mehanic.getCompany());
        }
        System.out.println();

    }
}

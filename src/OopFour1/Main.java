package OopFour1;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7);
        Car audi = new Car("Audi", "Q7", 2.5);
        Car uaz = new Car("UAZ", "Патриот", 2.0);
        System.out.println();
        Truks camaz = new Truks("Камаз","B-901",6.7);
        Truks gaz = new Truks("Газ","543",7.0);
        Truks ural = new Truks("Урал","2-901",6.3);
        System.out.println();
        Bus maz = new Bus("МАЗ","324",5.6);
        Bus nefaz = new Bus("НЕФАЗ","3-1",6.5);
        Bus olimp = new Bus("ОЛИМП","20-1",5.4);
    }
}

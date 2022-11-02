package OopThree1;

public class Main {
    public static void main(String[] args) {
        Car lada = new Car("Lada", "Granta", 1.7, "желтого цвета", 2015, "сборка в России", "Автомат", "Седана", "xx122xx221", 3, "Зимняя",null);
        System.out.println(lada);
        System.out.println();
        Train vagonOne = new Train("Ласточка","B-901",2011,"Россия",null,301, 3500, 3, "отходит от Белорусского вокзала ","следует до станции Минск-Пассажирский",11,null);
        Train vagonTwo = new Train("Ленинград","D-125",2019,"Россия",null,270, 1700, 3, "отходит от Ленинградского вокзала ","следует до станции Ленинград-Пассажирский",8,null);
        System.out.println(vagonOne);
        System.out.println(vagonTwo);
        System.out.println();
        Bus busOne = new Bus("Уаз","324",2010,"Россия","Белый",90, null);
        Bus busTwo = new Bus("Газ","3-1",2013,"Молдовия","Серый",60, null);
        Bus busThree = new Bus("Паз","20-1",2011,"Россия","Красный", 90, null);
        System.out.println(busOne);
        busOne.refill();
        System.out.println(busOne);
        System.out.println(busTwo);
        busTwo.refill();
        System.out.println(busTwo);
        System.out.println(busThree);
        busThree.refill();
        System.out.println(busThree);
    }
}

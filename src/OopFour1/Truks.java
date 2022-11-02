package OopFour1;

public class Truks extends Trasnsport implements Сompeting{
    public Truks(String mark, String model, double engineCapacity) {
        super(mark, model, engineCapacity);
    }

    @Override
    public void getMoving() {

    }

    @Override
    public void finishMoving() {

    }

    @Override
    public void pitStop(String command) {
        switch (command) {
            case "Топливо":
                System.out.println("До заправка топливом");
                break;
            case "Колесо":
                System.out.println("Замена колес");
                break;
            default:
                System.out.println("не удалось распознать команду");
                break;
        }
    }

    @Override
    public void bestLapTimeEver(double... command) {
        double bestTime = command[0];
        for (int i = 1; i < command.length; i++) {
            bestTime = Math.min(bestTime, command[i]);
        }
        System.out.println(bestTime + " - лучшее время за круг.");
    }

    @Override
    public void maxSpeed(int... speed) {
        int maxSpeed = speed[0];
        for (int i = 1; i < speed.length; i++) {
            maxSpeed = Math.max(maxSpeed, speed[i]);
        }
        System.out.println(maxSpeed + " - максимальная скорость.");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}

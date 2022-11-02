package OopFiveEnum;

public class Bus extends Trasnsport implements Сompeting {

    public enum SeatType {
        TIP_ESPEC_SMALL("до 10 мест"),
        TIP_SMALL("до 25 мест"),
        TIP_MEDIUM("40–50 мест"),
        TIP_LARGE("60–80 мест"),
        TIP_ESPEC_LARGE("100–120 мест");
        private String tupe;

        SeatType(String tupe) {
            this.tupe = tupe;
        }

        public String getTupe() {
            return tupe;
        }

        public void setTupe(String tupe) {
            this.tupe = tupe;
        }

        public void defineAutoType(String bus) {
            switch (bus) {
                case "особо малая":
                    System.out.println(TIP_ESPEC_SMALL.getTupe());
                    break;
                case "малая":
                    System.out.println(TIP_SMALL.getTupe());
                    break;
                case "средняя":
                    System.out.println(TIP_MEDIUM.getTupe());
                    break;
                case "большая":
                    System.out.println(TIP_LARGE.getTupe());
                    break;
                case "особо большая":
                    System.out.println(TIP_ESPEC_LARGE.getTupe());
                    break;
                default:
                    System.out.println("Данных по авто недостаточно.");
            }

        }
    }

    public Bus(String mark, String model, double engineCapacity) {
        super(mark, model, engineCapacity);
    }

    @Override
    public String getMark() {
        return super.getMark();
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

package OopThree2;

import java.util.Objects;

public class Mammals extends Animals {

    private String livingEnvironment;
    private int speed;

    public Mammals(String animalName, int yearsOld, String livingEnvironment, int speed) {
        super(animalName, yearsOld);
        setLivingEnvironment(livingEnvironment);
        setSpeed(speed);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment == null || livingEnvironment.isEmpty() ? "Данные введены не корректно." : livingEnvironment;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed > 0 ? speed : 0;
    }

    public void walk(){
        System.out.println(getAnimalName() + " идет гулять.");
    }

    @Override
    public void eat() {
    }

    @Override
    public void sleep() {
    }

    @Override
    public void go() {
    }

    @Override
    public String toString() {
        return  super.toString() +
                ", среда проживания -" + livingEnvironment +
                ",скорость перемещения -" + speed + "км/ч,";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return getSpeed() == mammals.getSpeed() && Objects.equals(getLivingEnvironment(), mammals.getLivingEnvironment());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, speed);
    }
}

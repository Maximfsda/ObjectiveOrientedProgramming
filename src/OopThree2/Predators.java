package OopThree2;

import java.util.Objects;

public class Predators extends Mammals{

    private String foodTupe;

    public Predators(String animalName, int yearsOld, String livingEnvironment, int speed, String foodTupe) {
        super(animalName, yearsOld, livingEnvironment, speed);
        this.foodTupe = foodTupe;
    }

    public String getFoodTupe() {
        return foodTupe;
    }

    public void setFoodTupe(String foodTupe) {
        this.foodTupe = foodTupe;
    }

    public void hunt(){
        System.out.println(getAnimalName() + " выходит на охоту.");
    }

    @Override
    public void eat() {
        System.out.println(getAnimalName() + " начинает есть.");
    }

    @Override
    public void sleep() {
        System.out.println(getAnimalName() + " ложиться спать");
    }

    @Override
    public void go() {
        System.out.println(getAnimalName() + " начинает перемещаться");
    }

    @Override
    public void walk() {
        System.out.println(getAnimalName() + " идет гулять");
    }

    @Override
    public String toString() {
        return super.toString() +
                " тип пищи -" + foodTupe + ".Пренадлежит к классу - Хищники";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(getFoodTupe(), predators.getFoodTupe());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foodTupe);
    }
}

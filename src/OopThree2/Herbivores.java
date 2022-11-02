package OopThree2;

import java.util.Objects;

public class Herbivores extends Mammals {

    private String foodTupe;

    public Herbivores(String animalName, int yearsOld, String livingEnvironment, int speed, String foodTupe) {
        super(animalName, yearsOld, livingEnvironment, speed);
        setFoodTupe(foodTupe);
    }

    public String getFoodTupe() {
        return foodTupe;
    }

    public void setFoodTupe(String foodTupe) {
        this.foodTupe = foodTupe == null || foodTupe.isEmpty() ? "Данные введены не корректно." : foodTupe;
    }

    public void graze() {
        System.out.println(getAnimalName() + " идет пастись.");
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
                " тип пищи -" + foodTupe + ".Принадлежит к классу - Травоядные.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(getFoodTupe(), that.getFoodTupe());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), foodTupe);
    }
}

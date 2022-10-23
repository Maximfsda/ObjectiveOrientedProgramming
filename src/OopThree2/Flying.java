package OopThree2;

import java.util.Objects;

public class Flying extends Birds{

    private String typeLocomotion;

    public Flying(String animalName, int yearsOld, String livingEnvironment, String typeLocomotion) {
        super(animalName, yearsOld, livingEnvironment);
        setTypeLocomotion(typeLocomotion);
    }

    public String getTypeLocomotion() {
        return typeLocomotion;
    }

    public void setTypeLocomotion(String typeLocomotion) {
        this.typeLocomotion = typeLocomotion == null || typeLocomotion.isEmpty() ? "Данные введены не корректно." : typeLocomotion;
    }

    public void hunt() {
        System.out.println(getAnimalName() + " летит охотиться.");
    }

    @Override
    public void eat() {
        System.out.println(getAnimalName() + " начинает есть.");
    }

    @Override
    public void sleep() {
        System.out.println(getAnimalName() + " начинает спать.");
    }

    @Override
    public void go() {
        System.out.println(getAnimalName() + " перемещается.");
    }

    public void fly() {
        System.out.println(getAnimalName() + " вылетает из гнезда.");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", тип передвежения -" + typeLocomotion +
                ". Относится к классу Летающие.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flying flying = (Flying) o;
        return Objects.equals(typeLocomotion, flying.typeLocomotion);
    }
}

package OopThree2;

import java.util.Objects;

public class NonFlying extends Birds {

    private String typeLocomotion;

    public NonFlying(String animalName, int yearsOld, String livingEnvironment, String typeLocomotion) {
        super(animalName, yearsOld, livingEnvironment);
        setTypeLocomotion(typeLocomotion);
    }

    public String getTypeLocomotion() {
        return typeLocomotion;
    }

    public void setTypeLocomotion(String typeLocomotion) {
        this.typeLocomotion = typeLocomotion == null || typeLocomotion.isEmpty() ? "Данные введены не корректно." : typeLocomotion;
    }

    public void hunt(Animals animals) {
        System.out.println(getAnimalName() + " идет охотиться.");
    }

    @Override
    public void eat( ) {
        System.out.println(getAnimalName() + " начинает есть.");
    }

    @Override
    public void sleep( ) {
        System.out.println(getAnimalName() + " ложиться спать.");
    }

    @Override
    public void go() {
        System.out.println(getAnimalName() + " перемещается.");
    }

    public void walk() {
        System.out.println(getAnimalName() + " идет гулять.");
    }

    @Override
    public String toString() {
        return super.toString() +
                ", тип передвижения -" + typeLocomotion +
                ".Пренадлежит классу - Нелетающие.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        NonFlying nonFlying = (NonFlying) o;
        return Objects.equals(typeLocomotion, nonFlying.typeLocomotion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeLocomotion);
    }
}

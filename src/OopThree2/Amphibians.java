package OopThree2;

import java.util.Objects;

public class Amphibians extends Animals {

    private String livingEnvironment;

    public Amphibians(String animalName, int yearsOld, String livingEnvironment) {
        super(animalName, yearsOld);
        setLivingEnvironment(livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment == null || livingEnvironment.isEmpty() ? "Данные введены не корректно." : livingEnvironment;
    }

    public void hunt(Animals animals){
        System.out.println(getAnimalName() + " выходит на охоту.");
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
        return super.toString() +
                ", тип пищи -" + livingEnvironment +
                ". Принадлежит к классу - Земноводные.";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Amphibians that = (Amphibians) o;
        return Objects.equals(getLivingEnvironment(), that.getLivingEnvironment());
    }
}

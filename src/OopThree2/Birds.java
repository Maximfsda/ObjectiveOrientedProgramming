package OopThree2;

import java.util.Objects;

public class Birds extends Animals{

    private String livingEnvironment;

    public Birds(String animalName, int yearsOld, String livingEnvironment) {
        super(animalName, yearsOld);
        setLivingEnvironment(livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = livingEnvironment == null || livingEnvironment.isEmpty() ? "Данные введены не корректно." : livingEnvironment;
    }

    public void hunt(){
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
                ", среда проживания -" + livingEnvironment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(getLivingEnvironment(), birds.getLivingEnvironment());
    }
}

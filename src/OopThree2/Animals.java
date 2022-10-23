package OopThree2;

import java.util.Objects;

public abstract class Animals {

    private final String animalName;
    private final int yearsOld;

    public Animals(String animalName, int yearsOld) {
        this.animalName = animalName;
        this.yearsOld = yearsOld;
    }

    public String getAnimalName() {
        return animalName;
    }

    public int getYearsOld() {
        return yearsOld;
    }
    public abstract void eat ();

    public abstract void sleep();

    public abstract void go();

    @Override
    public String toString() {
        return "Кличка животного -" + animalName +
                ",количество лет -" + yearsOld;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return getYearsOld() == animals.getYearsOld() && Objects.equals(getAnimalName(), animals.getAnimalName());
    }
}

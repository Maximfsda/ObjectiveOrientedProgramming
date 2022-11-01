package OopEightMultiple.ThreeOne;

import java.util.Objects;

public class Mehanic<T extends Trasnsport> {

    private final String name;
    private final String surname;
    private final String company;

    public Mehanic(String name, String surname, String company) {
        this.name = name;
        this.surname = surname;
        this.company = company;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getCompany() {
        return company;
    }

    public boolean servise(T t){
        return t.servise();
    }

    public void repair(T t){
        t.repair();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mehanic<?> mehanic = (Mehanic<?>) o;
        return Objects.equals(name, mehanic.name) && Objects.equals(surname, mehanic.surname) && Objects.equals(company, mehanic.company);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, company);
    }
}

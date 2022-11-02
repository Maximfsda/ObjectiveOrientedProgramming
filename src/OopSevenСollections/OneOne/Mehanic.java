package OopSevenСollections.OneOne;

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
}

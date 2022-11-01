package OopEightMultiple.Pasport;

import java.time.LocalDate;

public class Pasport {

    private final int number;
    private final String lastName;
    private final String middleName;
    private final String name;
    private final LocalDate localDate;

    public Pasport(int number, String lastName, String middleName, String name, LocalDate localDate) {
        this.number = number;
        this.lastName = lastName;
        this.middleName = middleName;
        this.name = name;
        this.localDate = localDate;
    }

    public int getNumber() {
        return number;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getName() {
        return name;
    }

    public LocalDate getLocalDate() {
        return localDate;
    }
}

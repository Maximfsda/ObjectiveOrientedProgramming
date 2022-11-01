package OopEightMultiple.Multiliple;

import java.util.Objects;

public class Task {

    private final int valueOne;
    private final int valueTwo;

    public Task(int valueOne, int valueTwo) {
        this.valueOne = valueOne;
        this.valueTwo = valueTwo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Task task = (Task) o;
        return (valueOne == task.valueOne && valueTwo == task.valueTwo) ||
                (valueOne == task.valueTwo && valueTwo == task.valueOne);
    }
    @Override
    public int hashCode() {
        return Objects.hash(valueOne * valueTwo);
    }

    @Override
    public String toString() {
        return String.format("%s * %s = ?",
                this.valueOne,this.valueTwo);
    }
}

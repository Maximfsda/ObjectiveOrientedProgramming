package OopSevenСollections.TwoTwo;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.Random;

public class Main {
    private static final List<String> NAMES = List.of(
            "Ваня Черешня",
            "Гаврила Лимский",
            "Кузя Плюшкин",
            "Макс Кувалда",
            "Антон Чихахуа",
            "Кирил Гундос",
            "Авраам Линкольн",
            "Кузя Винеда",
            "Михаил Горохов",
            "Гай Юлий Цезарь"
    );
    private static final Random RANDOM = new Random();
    private static final int MAX_SIZE = 5;


    public static void main(String[] args) {
        Queue<String> queueOne = new ArrayDeque<>();
        Queue<String> queueTwo = new ArrayDeque<>();
        randomFilling(queueOne);
        randomFilling(queueTwo);
        System.out.println("Первая очередь: " + queueOne);
        System.out.println("Вторая очередь: " + queueTwo);
        System.out.println();

        add("Витя АКА", queueOne, queueTwo);
        System.out.println("Первая очередь: " + queueOne);
        System.out.println("Вторая очередь: " + queueTwo);
        System.out.println();

        remove(queueOne, queueTwo);
        System.out.println("Первая очередь: " + queueOne);
        System.out.println("Вторая очередь: " + queueTwo);
        System.out.println();

    }

    private static void add(String name,
                            Queue<String> queueOne,
                            Queue<String> queueTwo) {
        if (queueOne.size() == MAX_SIZE && queueTwo.size() == MAX_SIZE) {
            System.out.println("Зовем Галю!!");
            return;
        }
        if (queueOne.size() < queueTwo.size()) {
            queueOne.offer(name);
        } else {
            queueTwo.offer(name);

        }
    }

    private static void randomFilling(Queue<String> queue) {
        int size = RANDOM.nextInt(MAX_SIZE + 1);
        for (int i = 0; i < size; i++) {
            queue.offer(NAMES.get(RANDOM.nextInt(NAMES.size())));

        }
    }

    private static void remove(Queue<String> queueOne,
                               Queue<String> queueTwo) {
        if (RANDOM.nextBoolean()) {
            queueOne.poll();
        } else {
            queueTwo.poll();
        }
    }
}

package OopEightMultiple.Product;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Product potate = new Product("Картошка", 12.0f, 2);

        Product redis = new Product("Редиска", 2.0f, 1);

        ProductList productList = new ProductList();
        productList.addProduct(potate);
        productList.addProduct(redis);
        System.out.println(productList);

        numbersRemoveEven();


    }


    private static void numbersRemoveEven() {
        Set<Integer> numbers = new HashSet<>(20);
        Random random = new Random();
        while (numbers.size() < 20) {
            numbers.add(random.nextInt(1000));
        }
        System.out.println(numbers);
        numbers.removeIf(next -> next % 2 != 0);
        System.out.println(numbers);
    }
}

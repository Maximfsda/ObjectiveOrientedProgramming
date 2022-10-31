package OopEightMultiple.Product;

public class Main {

    public static void main(String[] args) {
        Product potate = new Product("Картошка",12.0f,2);

        Product redis = new Product("Редиска",2.0f,1);

        ProductList productList  = new ProductList();
        productList.addProduct(potate);
        productList.addProduct(redis);
        System.out.println(productList);
        Product potate1 = new Product("Картошка",122.0f,7);
        productList.addProduct(potate1);

    }
}

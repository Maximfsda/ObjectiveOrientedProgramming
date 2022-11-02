package OopEightMultiple.Product;

import java.util.Objects;
import java.util.Set;

public class Recepts {

    private final String name;
    private final Set<Product> products;


    public Recepts(String name, Set<Product> products) {
        if (name == null || name.isBlank() || products == null || products.size() == 0) {
        throw new IllegalArgumentException("Поля не заполнены!");
        }
        this.name = name;
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public float getPeceptsPrise(){
        float sum = 0;
        for (Product product : products) {
            sum+= product.getPrise();
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Recepts recepts = (Recepts) o;
        return Objects.equals(name, recepts.name) && Objects.equals(products, recepts.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, products);
    }
}

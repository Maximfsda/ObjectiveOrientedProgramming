package OopEightMultiple.Product;

public class ProductAlredyExistsException extends RuntimeException {

    public ProductAlredyExistsException() {
    }

    public ProductAlredyExistsException(String message) {
        super(message);
    }
}

package OopEightMultiple.Product;

import java.util.Objects;

public class Product {
    private final String name;
    private final float prise;
    private final int quantity;

    private boolean checked;

    public Product(String name, float prise, int quantity) {
        if (name == null || name.isBlank() || prise < 0 || quantity < 0) {
            throw new IllegalArgumentException("Заполнити карточку продуктов полностью!");
        }
        this.name = name;
        this.prise = prise;
        this.quantity = quantity;
        this.checked = false;
    }

    public String getName() {
        return name;
    }

    public float getPrise() {
        return prise;
    }

    public int getQuantity() {
        return quantity;
    }

    public boolean isChecked() {
        return checked;
    }

    public void setChecked() {
        this.checked = true;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        String checkString = this.isChecked() ? "Да" : "Нет";
        return String.format("%s, Цена : %s, количество: %s, куплен: %s,",
                this.name,this.prise,
                this.quantity,checkString);
    }
}

import java.util.Iterator;
import java.util.Objects;

public class Product {

    private String name;
    private double price;
    private double kg;


    public Product(String name, double price, double kg) {
        this.name = name;
        this.price = price;
        this.kg = kg;
        if (name == null || name.isEmpty() || name.isBlank())
            throw new RuntimeException("Заполните карточку товара!");
        if (price <= 0 || kg <= 0)
            throw new RuntimeException("Заполните карточку товара");
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public double getKg() {
        return kg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.price, price) == 0 && Double.compare(product.kg, kg) == 0 && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, kg);
    }

    @Override
    public String toString() {

        return "{ " + name  +
                ": цена: " + price + " руб" +
                ", вес: " + kg + " кг " +
                '}';

    }


}
import java.util.*;
import java.util.function.Predicate;

class Product {
    String name;
    double price;
    boolean inStock;

    public Product(String name, double price, boolean inStock) {
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    @Override
    public String toString() {
        return name + " - $" + price + " - " + (inStock ? "In Stock" : "Out of Stock");
    }
}

public class Main {
    public static void main(String[] args) {

        List<Product> products = new ArrayList<>();
        products.add(new Product("Phone", 800, true));
        products.add(new Product("Mouse", 25, true));
        products.add(new Product("Keyboard", 45, false));
        products.add(new Product("Headphones", 30, true));

        // Predicate: keep only affordable AND in stock
        Predicate<Product> isAffordable = p -> p.price < 50 && p.inStock;

        // Remove items that DO NOT satisfy condition
        products.removeIf(p -> !isAffordable.test(p));

        System.out.println("Filtered Products:");
        for (Product p : products) {
            System.out.println(p);
        }
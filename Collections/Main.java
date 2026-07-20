import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        ProductService service = new ProductService();

        service.addProduct(new Product(101, "iPhone", 75000, 4.8));
        service.addProduct(new Product(102, "Samsung", 65000, 4.5));
        service.addProduct(new Product(103, "OnePlus", 45000, 4.6));
        service.addProduct(new Product(104, "Moto", 25000, 4.2));

        System.out.println("========== ORIGINAL PRODUCTS ==========");
        service.viewProducts();

        System.out.println("\n========== SORT BY PRICE ==========");
        service.sortByPrice();
        service.viewProducts();

        System.out.println("\n========== SORT BY RATING ==========");
        service.sortByRating();
        service.viewProducts();

    }
}



class Product {

    private int id;
    private String name;
    private int price;
    private double rating;

    public Product(int id, String name, int price, double rating) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", rating=" + rating +
                '}';
    }
}


class ProductService {

    private ArrayList<Product> products;

    public ProductService() {

        products = new ArrayList<>();

    }

    public void addProduct(Product pro) {

        products.add(pro);

    }

    public void viewProducts() {

        for (Product pro2: products) {

            System.out.println(pro2);

        }

    }

    public void sortByPrice() {

        Collections.sort(products, new PriceComparator());

    }

    public void sortByRating() {

        Collections.sort(products, new RatingComparator());

    }

}


class PriceComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {

        return Integer.compare(p1.getPrice(), p2.getPrice());

    }

}


class RatingComparator implements Comparator<Product> {

    @Override
    public int compare(Product p1, Product p2) {

        return Double.compare(p2.getRating(), p1.getRating());

    }

}
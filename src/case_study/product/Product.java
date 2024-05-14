package case_study.product;

public class Product {
    private int id;
    private String name;
    private String sku;
    private double price;
    private int onHand;
    private static int lastedID = 0;

    public Product(String name, String sku, double price, int onHand) {
        this.name = name;
        this.sku = sku;
        this.price = price;
        this.onHand = onHand;
        this.id = ++lastedID;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSku() {
        return sku;
    }

    public void setSku(String sku) {
        this.sku = sku;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getOnHand() {
        return onHand;
    }

    public void setOnHand(int onHand) {
        this.onHand = onHand;
    }

    @Override
    public String toString() {
        return String.format("Product id = %d, name = '%s', sku = '%s', price = %s, onHand = %d", id, name, sku, price, onHand);
    }
}

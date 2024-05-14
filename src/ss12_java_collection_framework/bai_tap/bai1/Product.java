package ss12_java_collection_framework.bai_tap.bai1;

public class Product{
    private int id;
    private String name;
    private double price;
    private static int lastedId = 0;

    public Product(String name, Double price) {
        this.id = ++lastedId;
        this.name = name;
        this.price = price;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return String.format("Product: id = %d, name = %s, price = %s ", id, name, price);
    }
}

package case_study.order;

import case_study.customer.Customer;
import case_study.product.Product;

import java.util.List;

public class Order {
    private Customer customer;
    private List<Product> listProduct;
    private int bookingDate;
    private double totalPrice;


    public Order(Customer customer, List<Product> listProduct, int bookingDate) {
        this.customer = customer;
        this.listProduct = listProduct;
        this.bookingDate = bookingDate;
        calculateTotalPrice();
    }

    public void getCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<Product> getProducts() {
        return listProduct;
    }

    public void setProducts(List<Product> listProduct) {
        this.listProduct = listProduct;
        calculateTotalPrice();
    }

    public int getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(int bookingDate) {
        this.bookingDate = bookingDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    private void calculateTotalPrice() {
        totalPrice = 0;
        for (Product product : listProduct) {
            totalPrice += product.getPrice();
        }
    }

    @Override
    public String toString() {
        return String.format("Order bookingDate = %d, total = %s", bookingDate, totalPrice);
    }
}

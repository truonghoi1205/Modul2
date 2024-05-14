package case_study.order;

import case_study.product.Product;

import java.util.ArrayList;
import java.util.List;

public class OrderManager {
    List<Order> listOrder;
    public OrderManager() {
        listOrder = new ArrayList<>();
    }
    public void displayTheOrderList() {
        for (Order order : listOrder) {
            if(order == null) {
                System.out.println("Không có đơn đặt hàng");
            } else {
                System.out.println(order);
            }
        }
    }
    public void displayProduct() {

    }
}

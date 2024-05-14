package case_study.order;

import case_study.customer.Customer;
import case_study.product.Product;

import java.io.*;
import java.util.List;

public class ReadAndWriteOrder {
    public static final String PATH_ORDER = "src/case_study/order.csv";
    public static void writeToFileOrder(List<Order> orderList) {
        try {
            FileWriter fileWriter = new FileWriter(PATH_ORDER);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Order order : orderList) {
                String line = order.getBookingDate() + "," + order.getTotalPrice();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void readToFileOrder(List<Order> orderList) {
//        try {
//            FileReader fileReader = new FileReader(PATH_ORDER);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//            String line;
//            while ((line = bufferedReader.readLine()) != null) {
//                String[] list = line.split(",");
//            }
//        }
    }
}

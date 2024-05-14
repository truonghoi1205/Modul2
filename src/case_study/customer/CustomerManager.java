package case_study.customer;

import java.util.ArrayList;
import java.util.List;

public class CustomerManager {
    List<Customer> listCustomer;
    private static final String PATH = "src/case_study/customer.csv";
    public CustomerManager() {
        listCustomer = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        listCustomer.add(customer);
        ReadAndWriteCustomer.writeToFileCustomer(listCustomer);
    }
    public void pay() {

    }
}

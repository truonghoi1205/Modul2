package case_study.customer;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class ReadAndWriteCustomer {
    public static final String PATH_CUSTOMER = "src/case_study/customer.csv";

    public void readToFileCustomer(List<Customer> listCustomer) {
        try {
            FileReader fileReader = new FileReader(PATH_CUSTOMER);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] list = line.split(",");
                Customer customer = new Customer(list[0], list[1], Integer.parseInt(list[2]), Integer.parseInt(list[3]), list[4]);
                listCustomer.add(customer);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeToFileCustomer(List<Customer> listCustomer) {
        try {
            FileWriter fileWriter = new FileWriter(PATH_CUSTOMER);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Customer customer : listCustomer) {
                String line = customer.getName() + "," + customer.getGender() + "," + customer.getAge();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

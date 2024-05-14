package case_study.product;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.List;

public class ReadAndWriteProduct {
    public static final String PATH_PRODUCT = "src/case_study/product.csv";
    public static void readToFileProduct(List<Product> listProduct) {
        try {
            FileReader fileReader = new FileReader(PATH_PRODUCT);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] list = line.split(",");
                Product product = new Product(list[0], list[1], Double.parseDouble(list[2]), Integer.parseInt(list[3]));
                listProduct.add(product);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void writeToFileProduct(List<Product> listProduct) {
        try {
            FileWriter fileWriter = new FileWriter(PATH_PRODUCT);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (Product product : listProduct) {
                String line = product.getName() + "," + product.getSku() + "," + product.getPrice() + "," + product.getOnHand();
                bufferedWriter.write(line);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

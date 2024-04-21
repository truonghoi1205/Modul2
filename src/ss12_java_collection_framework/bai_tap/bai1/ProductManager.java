package ss12_java_collection_framework.bai_tap;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductManager {
    List<Product> listProduct = new ArrayList<>();

    public void displayProduct() {
        System.out.println("Danh sách sản phẩm: ");
        for (Product product : listProduct) {
            System.out.println(product);
        }
    }

    public void addProduct(Product product) {
        listProduct.add(product);
    }

    public int findIndexById(int id) {
        for (int i = 0; i < listProduct.size(); i++) {
            if (listProduct.get(i).getId() == id) {
                return i;
            }
        }
        return -1;
    }

    public void editProduct(int id, Product product) {
        int index = findIndexById(id);
        listProduct.set(index, product);
    }

    public void deleteProduct(int id) {
        int index = findIndexById(id);
        listProduct.remove(index);
    }

    public Product findProductByName(String name) {
        for (Product product : listProduct) {
            if (product.getName().equals(name)) {
                return product;
            }
        }
        return null;
    }
}

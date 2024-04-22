package ss12_java_collection_framework.bai_tap.bai1;

import ss12_java_collection_framework.bai_tap.bai1.Product;

import java.util.*;

public class ProductManager {
    List<Product> listProduct = new ArrayList<>();

    public void displayProduct() {
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

    public void findProductByName(String name) {
        for (Product product : listProduct) {
            if (product.getName().toLowerCase().startsWith(name.toLowerCase())) {
                System.out.println(product);
            }
        }
    }
    public void sortProductsByAscendingPrice() {
        listProduct.sort(Comparator.comparingDouble(Product::getPrice));
    }
    public void sortProductsByPriceInDescendingOrder() {
        listProduct.sort(Comparator.comparingDouble(Product::getPrice).reversed());
    }
}

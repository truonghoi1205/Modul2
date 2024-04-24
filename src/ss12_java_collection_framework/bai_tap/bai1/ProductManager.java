package ss12_java_collection_framework.bai_tap.bai1;

import java.util.*;

public class ProductManager {
    public static Scanner scanner = new Scanner(System.in);
    List<Product> listProduct = new ArrayList<>();

    public void displayProduct() {
        if (listProduct.isEmpty()) {
            System.out.println("Không có sản phẩm nào");
        } else {
            for (Product product : listProduct) {
                System.out.println(product);
            }
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

    public Product findProductById(int id) throws Exception{
        if (findIndexById(id) == -1) {
            throw new Exception("không tìm thấy sản phẩm");
        }
        return listProduct.get(findIndexById(id));
    }

    public void editProduct(Product pr) {
            System.out.println("Vui lòng nhập lại tên sản phẩm: ");
            String inputName = scanner.nextLine();
            System.out.println("Vui lòng nhập lại giá sản phẩm: ");
            double inputPrice = scanner.nextDouble();
            pr.setName(inputName);
            pr.setPrice(inputPrice);
            System.out.println("============> Sửa thành công");
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
        listProduct.sort(new ProductComparator());
    }

    public void sortProductsByPriceInDescendingOrder() {
        listProduct.sort(new ProductComparator().reversed());
    }
}

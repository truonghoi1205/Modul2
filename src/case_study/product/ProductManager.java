package case_study.product;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {
    List<Product> productList;

    public ProductManager() {
        productList = new ArrayList<>();
    }


    public void showProduct() {
        for (Product product : productList) {
            if (product == null) {
                System.out.println("Không có sản phẩm");
                return;
            }
            System.out.println(product);

        }
        ReadAndWriteProduct.readToFileProduct(productList);
    }

    public void addProduct(Product product) {
        productList.add(product);
        ReadAndWriteProduct.writeToFileProduct(productList);
    }

    public Product findIndexById(int id) {
        try {
            for (Product product : productList) {
                if (product.getId() == id) {
                    return product;
                }
            }
            throw new IndexOutOfBoundsException("Không tìm thấy id sản phẩm");
        } catch (IndexOutOfBoundsException e) {
            System.err.println(e.getMessage());
        }
        return null;
    }

    public void deleteProduct(int id) {
        productList.remove(findIndexById(id));
        ReadAndWriteProduct.writeToFileProduct(productList);
    }

    public void editProduct(int id, Product product) {
        productList.set(id, product);
        ReadAndWriteProduct.writeToFileProduct(productList);
    }

    public void productArrangements() {
        productList.sort(new ProductComparator().reversed());
        ReadAndWriteProduct.writeToFileProduct(productList);
    }
}

package ss12_java_collection_framework.bai_tap.bai1;

import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class Menu {
    ProductManager productManager = new ProductManager();
    Scanner input = new Scanner(System.in);
    Scanner inputStr = new Scanner(System.in);

    public void showMenu() {
        int choice;
        do {
            System.out.println("---------Menu--------");
            System.out.println("1. Thêm sản phẩm mới");
            System.out.println("2. Sửa thông tin sản phẩm theo id");
            System.out.println("3. Xóa sản phẩm theo id");
            System.out.println("4. Hiển thị tất cả sản phẩm");
            System.out.println("5. Tìm kiếm sản phẩm theo tên");
            System.out.println("6. Sắp xếp sản phẩm tăng dần theo giá");
            System.out.println("7. Sắp xếp sản phẩm giảm dần theo giá");
            System.out.println("0. Đăng xuất");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    add();
                    break;
                case 2:
                    edit();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    display();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                    sortUp();
                    break;
                case 7:
                    sortDescending();
                    break;
            }
        } while (choice != 0);
    }

    public void display() {
        System.out.println("Danh sách sản phẩm: ");
        productManager.displayProduct();
    }

    public void add() {
        System.out.println("Vui lòng nhập tên sản phẩm: ");
        String name = inputStr.nextLine();
        System.out.println("Vui lòng nhập giá sản phẩm: ");
        double price = input.nextDouble();
        Product newProduct = new Product(name, price);
        productManager.addProduct(newProduct);
        System.out.println("=====> Thêm thành công");
    }

    public void delete() {
        System.out.println("Vui lòng nhập id sản phẩm bạn muốn xóa: ");
        int id = input.nextInt();
        productManager.deleteProduct(id);
        System.out.println("======> Xóa thành công");
    }

    public void edit() {
        System.out.println("Vui lòng nhập id sản phẩm bạn muốn sửa: ");
        while (true) {
            try {
                int inputId = input.nextInt();
                Product pr = productManager.findProductById(inputId);
                productManager.editProduct(pr);
                break;
            } catch (InputMismatchException ignored) {
                System.err.println("vui lòng nhập đúng id");
                input.next();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                return;
            }
        }
    }

    public void search() {
        System.out.println("Nhập tên sản phẩm bạn muốn tìm: ");
        String name = inputStr.nextLine();
        for (Product product : productManager.listProduct) {
            if (!Objects.equals(product.getName(), name)) {
                System.out.println("không tìm thấy sản phẩm " + name);
                break;
            } else {
                System.out.println("Kết quả " + "'" + name + "'" + " bạn muốn tìm:");
                productManager.findProductByName(name);
                break;
            }
        }
    }

    public void sortUp() {
        productManager.sortProductsByAscendingPrice();
        System.out.println("Danh sách sản phẩm giá tăng dần: ");
        productManager.displayProduct();
    }

    public void sortDescending() {
        productManager.sortProductsByPriceInDescendingOrder();
        System.out.println("Danh sách sản phẩm giá giảm dần: ");
        productManager.displayProduct();
    }
}


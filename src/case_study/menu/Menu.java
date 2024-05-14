package case_study.menu;

import case_study.product.Product;
import case_study.product.ProductManager;

import java.util.Scanner;

public class Menu {
    Scanner input = new Scanner(System.in);
    ProductManager productManager = new ProductManager();

    public void menu() {
        do {
            try {
                int choice;
                Scanner inputChoice = new Scanner(System.in);
                do {
                    System.out.println("---------Menu--------");
                    System.out.println("1. Thêm sản phẩm mới");
                    System.out.println("2. Hiển thị tất cả sản phẩm");
                    System.out.println("3. xóa sp");
                    System.out.println("4. sửa sp");
                    System.out.println("5. sắp xếp sp thep tên");
                    System.out.println("6. khách order");
                    System.out.println("0.Thoát");
                    System.out.println("chọn đi");
                    choice = Integer.parseInt(inputChoice.nextLine());
                    if (choice >= 0 && choice <= 6) {
                        switch (choice) {
                            case 1:
                                add();
                                break;
                            case 2:
                                show();
                                break;
                            case 3:
                                delete();
                                break;
                            case 4:
                                break;
                            case 5:
                                sort();
                                break;
                            case 6:

                            case 0:
                                break;
                        }
                    } else {
                        System.out.println("Không có lựa chọn này!!");
                    }
                } while (choice != 0);
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập đúng lựa chọn!!");
            }
        } while (true);
    }

    public void add() {
        System.out.println("nhập tên sp");
        String name = input.nextLine();

        System.out.println("nhập Sku");
        String sku = input.nextLine();
        double price = 0;
        System.out.println("nhập giá");
        try {
            price = Double.parseDouble(input.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Vui lòng nhập số");
        }
        int onHand = 0;
        System.out.println("nhập tồn kho");
        try {
            onHand = Integer.parseInt(input.nextLine());
        } catch (NumberFormatException e) {
            System.err.println("Vui lòng nhập số");
        }
        Product product = new Product(name, sku, price, onHand);
        productManager.addProduct(product);
    }

    public void show() {
        productManager.showProduct();
    }

    public void delete() {
        System.out.println("nhập id muốn xóa");
        int id = input.nextInt();
        productManager.deleteProduct(id);
    }

    public void edit() {

    }

    public void sort() {
        productManager.productArrangements();
    }

    public void menuOrder() {
        int choice;

    }
}

package ss12_java_collection_framework.bai_tap;

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
            System.out.println("6. Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
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
                    break;
            }
        } while (choice != 0);
    }

    public void display() {
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
        int id = input.nextInt();
        System.out.println("Vui lòng nhập lại tên sản phẩm: ");
        String name = inputStr.nextLine();
        System.out.println("Vui lòng nhập lại giá sản phẩm: ");
        double price = input.nextDouble();
        Product newProduct = new Product(id, name, price);
        productManager.editProduct(id, newProduct);
        System.out.println("======> Sửa thành công");
    }
    public void search() {
        System.out.println("Nhập tên sản phẩm bạn muốn tìm: ");
        String name = inputStr.nextLine();
        if(productManager.findProductByName(name) !=  null) {
            System.out.println(productManager.listProduct);
        } else{
            System.out.println("không tìm thấy sản phẩm");
        }
    }
}

package ss16_io_text_file.thuc_hanh;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        Scanner input = new Scanner(System.in);
        System.out.println("nhập tên: ");
        String name = input.nextLine();
        System.out.println("nhập mật khẩu: ");
        String password = input.nextLine();
        System.out.println("nhập email: ");
        String email = input.nextLine();
        User user = new User(name, password, email);
        userManager.add(user);
        userManager.showAll();
    }
}

package ss17_io_binary_file_and_serialization.bai_tap;

import java.io.*;
import java.util.Scanner;

public class ProductManager {
    private static final String FILE_PATH = "src/ss17_io_binary_file_and_serialization/bai_tap/products.dat";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Product Management System");
            System.out.println("1. Add Product");
            System.out.println("2. Display Products");
            System.out.println("3. Search Product");
            System.out.println("4. Exit");
            System.out.println("Enter your choice:");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    displayProducts();
                    break;
                case 3:
                    searchProduct();
                    break;
                case 4:
                    System.out.println("Exiting Program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);
        scanner.close();
    }

    private static void addProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product code:");
        String code = scanner.nextLine();
        System.out.println("Enter product name:");
        String name = scanner.nextLine();
        System.out.println("Enter product price:");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.println("Enter product manufacturer:");
        String manufacturer = scanner.nextLine();
        System.out.println("Enter product description:");
        String description = scanner.nextLine();

        Product product = new Product(code, name, price, manufacturer, description);
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_PATH, true))) {
            oos.writeObject(product);
            System.out.println("Product added successfully!");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void displayProducts() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            System.out.println("List of Products:");
            Object obj;
            while ((obj = ois.readObject()) != null) {
                if (obj instanceof Product) {
                    System.out.println(obj);
                }
            }
        } catch (EOFException e) {
            // End of file reached
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static void searchProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter product code to search:");
        String searchCode = scanner.nextLine();

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_PATH))) {
            Object obj;
            while ((obj = ois.readObject()) != null) {
                if (obj instanceof Product) {
                    Product product = (Product) obj;
                    if (product.getCode().equalsIgnoreCase(searchCode)) {
                        System.out.println("Product found:");
                        System.out.println(product);
                        return;
                    }
                }
            }
            System.out.println("Product not found with code: " + searchCode);
        } catch (EOFException e) {
            // End of file reached
            System.out.println("Product not found with code: " + searchCode);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

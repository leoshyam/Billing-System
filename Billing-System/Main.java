import java.util.ArrayList;
import java.util.Scanner;

class Item {
    private String name;
    private double price;
    private int quantity;

    public Item(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }
}

class BillingSystem {
    private ArrayList<Item> cart;

    public BillingSystem() {
        cart = new ArrayList<>();
    }

    public void addItem(Item item) {
        cart.add(item);
    }

    public void generateBill() {
        double total = 0.0;

        System.out.println("========== Your Bill ==========");
        for (Item item : cart) {
            double itemTotal = item.getPrice() * item.getQuantity();
            System.out.printf("%s - %.2f x %d = %.2f\n", item.getName(), item.getPrice(), item.getQuantity(), itemTotal);
            total += itemTotal;
        }

        System.out.println("===============================");
        System.out.printf("Total: %.2f\n", total);
        System.out.println("===============================");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BillingSystem billingSystem = new BillingSystem();

        while (true) {
            System.out.println("1. Add Item to Cart");
            System.out.println("2. Generate Bill");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter item price: ");
                    double price = scanner.nextDouble();
                    System.out.print("Enter item quantity: ");
                    int quantity = scanner.nextInt();
                    scanner.nextLine(); // Consume newline character
                    Item item = new Item(name, price, quantity);
                    billingSystem.addItem(item);
                    break;
                case 2:
                    billingSystem.generateBill();
                    break;
                case 3:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter again.");
            }
        }
    }
}

import java.util.Scanner;

class Product {
    String productName;
    double unitPrice;
    int quantity;

    Product(String productName, double unitPrice, int quantity) {
        this.productName = productName;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    double getTotalCost() {
        return unitPrice * quantity;
    }
}

class CartSystem {
    Product[] items = new Product[100];
    int totalItems = 0;

    void addProduct(String productName, double unitPrice, int quantity) {
        items[totalItems++] = new Product(productName, unitPrice, quantity);
        System.out.println("Product added to cart.");
    }

    void removeProduct(String productName) {
        boolean found = false;
        for (int i = 0; i < totalItems; i++) {
            if (items[i].productName.equalsIgnoreCase(productName)) {
                for (int j = i; j < totalItems - 1; j++) {
                    items[j] = items[j + 1];
                }
                items[--totalItems] = null;
                System.out.println("Product removed from cart.");
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Product not found in cart.");
        }
    }

    void showTotalBill() {
        double total = 0;
        for (int i = 0; i < totalItems; i++) {
            total += items[i].getTotalCost();
        }
        System.out.println("Total Bill Amount: ₹" + total);
    }
}
public class CartManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CartSystem cart = new CartSystem();
        while (true) {
            System.out.println("\n1. Add Product");
            System.out.println("2. Remove Product");
            System.out.println("3. View Total Bill");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("Enter product name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter unit price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    cart.addProduct(name, price, qty);
                    break;
                case 2:
                    System.out.print("Enter product name to remove: ");
                    String removeName = sc.nextLine();
                    cart.removeProduct(removeName);
                    break;
                case 3:
                    cart.showTotalBill();
                    break;
                case 4:
                    System.out.println("Thanks for shopping with us!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}


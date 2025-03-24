import java.util.Scanner;

class Item4{
    String itemCode;
    String itemName;
    double price;

    Item(String itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void showDetails(int quantity) {
        System.out.println("\nItem Details:");
        System.out.println("Item Code  : " + itemCode);
        System.out.println("Item Name  : " + itemName);
        System.out.println("Unit Price : ₹" + price);
        System.out.println("Quantity   : " + quantity);
        System.out.println("Total Cost : ₹" + (price * quantity));
    }
}

public class Item4
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Item Code: ");
        String code = scanner.nextLine();

        System.out.print("Enter Item Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Price: ");
        double price = scanner.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = scanner.nextInt();

        Item4 item= new Item4    (code,name, price);
        item.showDetails(quantity);

    }
}



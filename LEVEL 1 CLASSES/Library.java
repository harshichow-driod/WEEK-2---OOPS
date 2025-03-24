import java.util.Scanner;

class Library {
    String book;
    String author;
    double price;

    Library(String book, String author, double price) {
        this.book = book;
        this.author = author;
        this.price = price;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter details for Book 1:");
        System.out.print("Book Name: ");
        String book1 = scanner.nextLine();
        System.out.print("Author: ");
        String author1 = scanner.nextLine();
        System.out.print("Price: ");
        double price1 = scanner.nextDouble();
        scanner.nextLine(); 

        Library b1 = new Library(book1, author1, price1);


        System.out.println("\nEnter details for Book 2:");
        System.out.print("Book Name: ");
        String book2 = scanner.nextLine();
        System.out.print("Author: ");
        String author2 = scanner.nextLine();
        System.out.print("Price: ");
        double price2 = scanner.nextDouble();

        Library b2 = new Library(book2, author2, price2);

    
        System.out.println("Name of the Book : " + b1.book);
        System.out.println("Author           : " + b1.author);
        System.out.println("Price            : ₹" + b1.price);

        System.out.println("Name of the Book : " + b2.book);
        System.out.println("Author           : " + b2.author);
        System.out.println("Price            : ₹" + b2.price);
    }
}

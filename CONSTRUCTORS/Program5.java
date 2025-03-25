class Book{
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
        this.isAvailable=true;
    }
    public void borrow(){
        if(isAvailable){
            isAvailable=false;
            System.out.println(title+" is successfully borrowed");
        }
        else System.out.println(title+" is not available");
    }
    public void display(){
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
        System.out.println("Price: "+price);
        System.out.println("Availability: "+(isAvailable? "Available":"Not Available"));
    }
}
public class Program5 {
    public static void main(String[] args) {
        Book b1=new Book("The Alchemist", "Paulo Coelho", 499.99);
        System.out.println("Book details");
        b1.display();
        System.out.println("Trying to borrow book");
        b1.borrow();
        System.out.println("Updated details");
        b1.display();
        System.out.println("Borrowing same book again");
        b1.borrow();
    }
}

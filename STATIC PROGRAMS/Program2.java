class Book{
    static String libraryName="SRM Library";
    private String title;
    private String author;
    private final String isbn;
     
    public static void displayLibraryName(){
        System.out.println("Library Name: "+libraryName);
    }
    Book(String title,String author,String isbn){
        this.title=title;
        this.author=author;
        this.isbn=isbn;
    }
    public void display(){
        if(this instanceof Book){
            System.out.println("Title: "+title);
            System.out.println("Author: "+author);
            System.out.println("ISBN: "+isbn);
        }
    }
}
public class Program2 {
    public static void main(String[] args) {
        Book b1 = new Book("The Alchemist", "Paulo Coelho", "1234567890");
        Book b2 = new Book("1984", "George Orwell", "0987654321");

        Book.displayLibraryName();
        b1.display();
        System.out.println("");
        b2.display();
    }
}
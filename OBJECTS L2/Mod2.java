

class Book{
    public String isbn;
    protected String title;
    private String author;

    Book(String isbn,String title,String author){
        this.isbn=isbn;
        this.title=title;
        this.author=author;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public void display(){
        System.out.println("ISBN: "+isbn);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
    }
   
}
class EBook extends Book{
    private double size;
    EBook(String isbn,String title,String author,double size){
        super(isbn,title,author);
        this.size=size;
    }
    public void displayEbook(){
        System.out.println("ISBN: "+isbn);
        System.out.println("Title: "+title);
        System.out.println("Author: "+getAuthor());
        System.out.println("Size: "+size);
    }

}
public class Mod2 {
    public static void main(String[] args) {
        Book b1=new Book("123-456-789", "Java Programming", "John Doe");
        b1.display();
        b1.setAuthor("John Cena");
        System.out.println("After updating author...");
        b1.display();
        EBook e1=new EBook("987-654-321", "Python for AI", "Alice Brown", 2.5);
        e1.displayEbook();
    }
   
}


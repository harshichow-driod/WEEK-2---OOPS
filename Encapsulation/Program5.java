abstract class LibraryItem{
    private int itemId;
    private String title;
    private String author;
    public LibraryItem(int itemId,String title,String author){
        this.itemId=itemId;
        this.title=title;
        this.author=author;
    }
    public abstract int getLoanDuration();
    public void getItemDetails(){
        System.out.println("Item ID: "+itemId);
        System.out.println("Title: "+title);
        System.out.println("Author: "+author);
    }
    public String getTitle(){
        return title;
    }
}
interface Reservable{
    void reserveItem(String borrowerName);
    boolean checkAvailability();
}
class Book extends LibraryItem implements Reservable{
    private String borrowerName;
    private boolean isAvailable=true;
    public Book(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public void reserveItem(String borrowerName) {
        if(isAvailable){
            isAvailable=false;
            this.borrowerName=borrowerName;
            System.out.println("Book is reserved by "+borrowerName);
        }
        else System.out.println("Book is currently unavailable");
    }

    @Override
    public boolean checkAvailability() {
       return isAvailable;
    }

    @Override
    public int getLoanDuration() {
        return 30;
    }
    
}
class Magazine extends LibraryItem implements Reservable{
    private String borrowerName;
    private boolean isAvailable=true;
    public Magazine(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public void reserveItem(String borrowerName) {
        if(isAvailable){
            isAvailable=false;
            this.borrowerName=borrowerName;
            System.out.println("Magazine is reserved by "+borrowerName);
        }
        else System.out.println("Magazine is currently unavailable");
    }

    @Override
    public boolean checkAvailability() {
       return isAvailable;
    }

    @Override
    public int getLoanDuration() {
        return 7;
    }
    
}
class Dvd extends LibraryItem implements Reservable{
    private String borrowerName;
    private boolean isAvailable=true;
    public Dvd(int itemId, String title, String author) {
        super(itemId, title, author);
    }

    @Override
    public void reserveItem(String borrowerName) {
        if(isAvailable){
            isAvailable=false;
            this.borrowerName=borrowerName;
            System.out.println("Dvd is reserved by "+borrowerName);
        }
        else System.out.println("Dvd is currently unavailable");
    }

    @Override
    public boolean checkAvailability() {
       return isAvailable;
    }

    @Override
    public int getLoanDuration() {
        return 10;
    }
    
}
public class Program5 {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[3];
        items[0] = new Book(1, "1984", "George Orwell");
        items[1] = new Magazine(2, "National Geographic", "NatGeo Editors");
        items[2] = new Dvd(3, "Interstellar", "Christopher Nolan");

        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");

            if (item instanceof Reservable) {
                ((Reservable) item).reserveItem("Alice");
                System.out.println("Available: " + ((Reservable) item).checkAvailability());
            }

            System.out.println("-----------------------------------");
        }
        
    }
}

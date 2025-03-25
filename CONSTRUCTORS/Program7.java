class Product{
    private String productName;
    private double price;
    static int totalProducts;

    Product(String productName,double price){
        this.productName=productName;
        this.price=price;
        totalProducts++;
    }
    public void display(){
        System.out.println("Product Name: "+productName);
        System.out.println("Price: "+price);
    }
    static void displayTotal(){
        System.out.println("Total Products: "+totalProducts);
    }
}
public class Program7 {
    public static void main(String[] args) {
        Product p1=new Product("Laptop", 55000);
        p1.display();
        Product p2=new Product("Bottle", 150);
        p2.display();
        Product.displayTotal();
    }
}

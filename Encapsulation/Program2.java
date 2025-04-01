abstract class Product{
    private int productId;
    private String name;
    private double price;
    public Product(int productId,String name,double price){
        this.productId=productId;
        this.name=name;
        this.price=price;
    }
    abstract double calculateDiscount();
    public void display(){
        System.out.println("Product ID: "+productId);
        System.out.println("Name: "+name);
        System.out.println("Price: "+price);
    }
    public int getProductId(){
        return productId;
    }
    public String getName(){
        return name;
    }
    public double getPrice(){
        return price;
    }
    public void setPrice(double price){
        this.price=price;
    }
}
interface Taxable{
    double calculateTax();
    String getTaxDetails();
}
class Electronics extends Product implements Taxable{
    public Electronics(int productId,String name,double price){
        super(productId, name, price);
    }

    @Override
    public double calculateTax() {
        return getPrice()*0.18;
    }

    @Override
    public String getTaxDetails() {
        return "18% gst applied on electronics";
    }

    @Override
    double calculateDiscount() {
        return getPrice()*0.10;
    }
    
}
class Clothing extends Product implements Taxable{

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateTax() {
        return getPrice()*0.12;
    }

    @Override
    public String getTaxDetails() {
        return "12% gst applied on clothes";
    }

    @Override
    double calculateDiscount() {
        return getPrice()*0.15;
    }
    
}
class Grocery extends Product{

    public Grocery(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice()*0.5;
    }
    
}
public class Program2 {
    public static void main(String[] args) {
        Product[] products ={
            new Electronics(123, "Mobile", 8000),
            new Clothing(124, "T-Shirt", 600),
            new Grocery(125, "Rice bag", 1200)
        };
        for(Product p:products){
            p.display();
            double tax=0;
            if(p instanceof Taxable){
                tax=((Taxable)p).calculateTax();
            }
            else System.out.println("No Tax Applicable");
            double discount= p.calculateDiscount();
            double totalPrice= p.getPrice()+tax-discount;
            System.out.println("Tax: "+String.format("%.2f", tax));
            System.out.println("Discount: "+String.format("%.2f", discount));
            System.out.println("TOTAL PRICE: "+String.format("%.2f", totalPrice));
        }
    }
}

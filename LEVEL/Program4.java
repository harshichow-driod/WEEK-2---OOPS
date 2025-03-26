class Product{
    public static double discount=10;
    private String productName;
    private double price;
    private int quantity;
    private final int productID;
    Product(String productName,double price,int quantity,int productID){
        this.productName=productName;
        this.price=price;
        this.quantity=quantity;
        this.productID=productID;
    }

    public static void updateDiscount(double newDiscount){
        discount=newDiscount;
        System.out.println("Discount updated to "+newDiscount+"%");
    }
    public void display(){
        if(this instanceof Product){
            System.out.println("Product ID: "+productID);
            System.out.println("Product Name: "+productName);
            System.out.println("Price: "+price);
            System.out.println("Quantity: "+quantity);
            System.out.println("Discount: "+discount+"%");
        }

    }
}
public class Program4 {
    public static void main(String[] args) {
        Product p1=new Product("Pencil",5.5,3,234);
        p1.display();
        Product.updateDiscount(15);
        p1.display();

    }
}


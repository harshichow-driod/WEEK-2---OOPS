abstract class FoodItem{
    private String itemName;
    private double price;
    private int quantity;
    public FoodItem(String itemName,double price,int quantity){
        this.itemName=itemName;
        this.price=price;
        this.quantity=quantity;
    }
    public abstract double calculateTotalPrice();
    public void getItemDetails(){
        System.out.println("Item Name: "+itemName);
        System.out.println("Price: "+price);
        System.out.println("Quantity: "+quantity);
    }
    public String getItemName(){
        return itemName;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
}
interface Discountable{
    void applyDiscount(double percentage);
    String getDiscountDetails();
}
class VegItem extends FoodItem implements Discountable{
    private double discountApplied=0;
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public void applyDiscount(double percentage) {
        discountApplied= (getPrice()*getQuantity())*(percentage/100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Applied: $"+discountApplied;
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice()*getQuantity()-discountApplied;
    }
    
}
class NonVegItem extends FoodItem implements Discountable{
    private double discountApplied=0;
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
    }

    @Override
    public void applyDiscount(double percentage) {
        discountApplied=(getPrice()*getQuantity())*(percentage/100);
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Applied: "+String.format("%.2f",discountApplied);
    }

    @Override
    public double calculateTotalPrice() {
        return getPrice()*getQuantity()-discountApplied;
    }
    
}
public class Program6 {
    public static void main(String[] args) {
        FoodItem[] foods=new FoodItem[2];
        foods[0]=new VegItem("Panner Tikka", 220,2);
        foods[1]=new NonVegItem("Mutton Biryani",449,3);
        for(FoodItem food:foods){
            food.getItemDetails();
            double discountAmount=0;
            double total=0;
            if(food instanceof Discountable){
                ((Discountable)food).applyDiscount(5);
                System.out.println(((Discountable)food).getDiscountDetails());
                total=food.calculateTotalPrice();
                System.out.println("Total Price: "+total);
            }
        }
        
    }
}

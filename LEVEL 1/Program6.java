
class Order{
    protected int orderId;
    protected String date;
    public Order(int orderId,String date){
        this.orderId=orderId;
        this.date=date;
    }
    public void displayInfo(){
        System.out.println("Order ID: "+orderId);
        System.out.println("Date: "+date);
    }
}
class ShippedOrder extends Order{
    protected int trackingNumber;
    public ShippedOrder(int orderId,String date,int trackingNumber){
        super(orderId, date);
        this.trackingNumber=trackingNumber;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Tracking Number: "+trackingNumber);
    }

}
class DeliveredOrder extends ShippedOrder{
    protected String deliveryDate;
    public DeliveredOrder(int orderId,String date,int trackingNumber,String deliveryDate){
        super(orderId, date, trackingNumber);
        this.deliveryDate=deliveryDate;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Delivery Date: "+deliveryDate);
    }
}
public class Program6 {
    public static void main(String[] args) {
        DeliveredOrder delivery1=new DeliveredOrder(101, "4/7/2025", 121212, "10/7/2025");
        delivery1.displayInfo();
    }
}





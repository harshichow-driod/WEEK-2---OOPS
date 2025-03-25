class CarRental{
    private String customerName;
    private String carModel;
    private int rentalDays;

    CarRental(String customerName,String carModel,int rentalDays){
        this.customerName=customerName;
        this.carModel=carModel;
        this.rentalDays=rentalDays;
    }
    public double totalCost(){
        double modelRate=switch(carModel.toLowerCase()){
            case "bmw" -> 5000.0;
            case "audi" -> 4550.0;
            case "benz" -> 5500.0;
            default -> 2000.0;
        };
        return modelRate*rentalDays;
    }
    public void display(){
        System.out.println("Customer Name: "+customerName);
        System.out.println("Car Model: "+carModel);
        System.out.println("Rental days: "+rentalDays);
        System.out.println("Total Cost: "+totalCost());
    }
}
public class Program6 {
    public static void main(String[] args) {
        CarRental car1=new CarRental("Rakesh","audi",5);
        car1.display();
        System.out.println("");
        CarRental car2=new CarRental("Anirudh", "Swift", 2);
        car2.display();
    }
    
}

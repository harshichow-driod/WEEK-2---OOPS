abstract class Vehicle{
    private int vehicleNumber;
    private String type;
    private int rentalRate;
    public Vehicle(int vehicleNumber,String type,int rentalRate){
        this.vehicleNumber=vehicleNumber;
        this.type=type;
        this.rentalRate=rentalRate;
    }
    public abstract double calculateRentalCost(int days);
    public int getVehicleNumber(){
        return vehicleNumber;
    }
    public String getType(){
        return type;
    }
    public int getRentalRate(){
        return rentalRate;
    }
    public void display(){
        System.out.println("Vehicle Number: "+vehicleNumber);
        System.out.println("Type: "+type);
        System.out.println("Rental Rate: "+rentalRate);
    }
}
interface Insurable{
    double calculateInsurance();
    String getInsuranceDetails();
}
class Car extends Vehicle implements Insurable{

    public Car(int vehicleNumber, String type, int rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate()*0.10;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance: 10% of rental rate";
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate()*days;
    }
    
}
class Bike extends Vehicle implements Insurable{

    public Bike(int vehicleNumber, String type, int rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate()*0.05;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance: 5% of rental rate";
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate()*days;
    }
    
}
class Truck extends Vehicle implements Insurable{

    public Truck(int vehicleNumber, String type, int rentalRate) {
        super(vehicleNumber, type, rentalRate);
    }

    @Override
    public double calculateInsurance() {
        return getRentalRate()*0.15;
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance: 15% of rental rate";
    }

    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate()*days;
    }
    
}
public class Program3 {
    public static void main(String[] args) {
        Vehicle[] vehicles={
            new Car(5267, "Car", 1000),
            new Bike(1289, "Bike", 300),
            new Truck(2367, "Truck", 2500)
        };
        for(Vehicle v:vehicles){
            v.display();
            double insurance=0;
            if(v instanceof Insurable){
                insurance=((Insurable)v).calculateInsurance();
                ((Insurable)v).getInsuranceDetails();
            }
            double rentalCost=v.calculateRentalCost(5);
            double total=insurance+rentalCost;
            System.out.println("Insurance: "+String.format("%.2f", insurance));
            System.out.println("Rental Cost: "+String.format("%.2f", rentalCost));
            System.out.println("TOTAL AMOUNT: "+String.format("%.2f", total));
            System.out.println("---------------------------------------------------------");
        }
        
    }
}

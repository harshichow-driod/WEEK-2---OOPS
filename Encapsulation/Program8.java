abstract class Vehicle implements GPS{
    private int vehicleId;
    private String driverName;
    private double ratePerKm;
    private String currentLocation;
    public Vehicle(int vehicleId,String driverName,double ratePerKm,String currentLocation){
        this.vehicleId=vehicleId;
        this.driverName=driverName;
        this.ratePerKm=ratePerKm;
        this.currentLocation=currentLocation;
    }
    public abstract double calculateFare(double distance);
    public void getVehicleDetails(){
        System.out.println("Vehicle ID: "+vehicleId);
        System.out.println("Driver Name: "+driverName);
        System.out.println("Rate Per KM: "+ratePerKm);
    }
    public double getRate(){
        return ratePerKm;
    }
    @Override
    public String getCurrentLocation(){
        return currentLocation;
    }
    @Override
    public void updateLocation(String newLocation){
        this.currentLocation=newLocation;
    }

} 
interface GPS{
    String getCurrentLocation();
    void updateLocation(String newLocation);
}
class Car extends Vehicle{

    public Car(int vehicleId, String driverName, double ratePerKm,String location) {
        super(vehicleId, driverName, ratePerKm,location);
    }

    @Override
    public double calculateFare(double distance) {
        return getRate()*distance;
    }
    
}
class Bike extends Vehicle{

    public Bike(int vehicleId, String driverName, double ratePerKm,String location) {
        super(vehicleId, driverName, ratePerKm,location);
    }

    @Override
    public double calculateFare(double distance) {
        return getRate()*distance;
    }
    
}
class Auto extends Vehicle{

    public Auto(int vehicleId, String driverName, double ratePerKm,String location) {
        super(vehicleId, driverName, ratePerKm,location);
    }

    @Override
    public double calculateFare(double distance) {
        return getRate()*distance;
    }
    
}
public class Program8 {
    public static void main(String[] args) {
        Vehicle car=new Car(1234, "Monesh", 50, "Metro");
        Vehicle bike=new Bike(4567, "Madhan", 20, "Beach");
        Vehicle auto=new Auto(7890, "Praveen", 10, "SRM College");
        Vehicle[] vehicles={car,bike,auto};
        double distance=10;
        for(Vehicle v:vehicles){
            v.getVehicleDetails();
            System.out.println("Current Location: "+v.getCurrentLocation());
            System.out.println("Fare Amount: "+v.calculateFare(distance));
            System.out.println("--------------------------------");
        }
    }
}

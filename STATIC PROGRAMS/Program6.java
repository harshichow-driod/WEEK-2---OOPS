class Vehicle{
    static double registrationFee=2500;
    private String ownerName;
    private String vehicleType;
    private final String registerNumber;

    Vehicle(String ownerName,String vehicleType,String registerNumber){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
        this.registerNumber=registerNumber;
    }
    public static void updateRegistrationFee(double newFee){
        registrationFee=newFee;
        System.out.println("Registration Fee is updated to Rs."+registrationFee);
    }
    public void display(){
        if(this instanceof Vehicle){
        System.out.println("Owner Name: "+ownerName);
        System.out.println("Vehicle Type: "+vehicleType);
        System.out.println("Register Number: "+registerNumber);
        }
    }
}
public class Program6{
    public static void main(String[] args){
        Vehicle v1=new Vehicle("Rakii", "Bike", "0214");
        v1.display();
        Vehicle.updateRegistrationFee(3000);
        System.out.println("After updating registration fee");
        v1.display();

    }
}
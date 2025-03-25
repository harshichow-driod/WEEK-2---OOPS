class Vehicle{
    private String ownerName;
    private String vehicleType;
    static int registrationFee = 5000;
    
    Vehicle(String ownerName,String vehicleType){
        this.ownerName=ownerName;
        this.vehicleType=vehicleType;
    }
    public void displayCourseDetails(){
        System.out.println("Owner Name: "+ownerName);
        System.out.println("Vehicle Type: "+vehicleType);
        System.out.println("Registration Fee: Rs."+registrationFee);
    }
    static void updateRegistrationFee(int update){
        registrationFee=update;
    }
}
public class Program9 {
    public static void main(String[] args) {
        Vehicle v1=new Vehicle("Rakesh","Bike");
        Vehicle v2=new Vehicle("Harshi", "Car");
        System.out.println("Before update");
        v1.displayCourseDetails();
        v2.displayCourseDetails();
        Vehicle.updateRegistrationFee(7500);
        System.out.println("After update");
        v1.displayCourseDetails();
        v2.displayCourseDetails();
    }
        
}
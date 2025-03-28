
class Device{
    protected String deviceId;
    protected String status;
    public Device(String deviceId,String status){
        this.deviceId=deviceId;
        this.status=status;
    }
    public void displayInfo(){
        System.out.println("Device ID: "+deviceId);
        System.out.println("Status: "+status);
    }
}
class Thermostat extends Device{
    private double temperatureSetting;
    public Thermostat(String deviceId,String status,double temperatureSetting){
        super(deviceId,status);
        this.temperatureSetting=temperatureSetting;
    }
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Temperature Setting: "+temperatureSetting+" C");
    }
}
public class Program5 {
    public static void main(String[] args) {
        Thermostat thermostat1 = new Thermostat("THM1234", "Online", 22.5);
        Thermostat thermostat2 = new Thermostat("THM5678", "Offline", 18.0);
        thermostat1.displayInfo();
        System.out.println("----------------------------");
        thermostat2.displayInfo();
    }
   
}


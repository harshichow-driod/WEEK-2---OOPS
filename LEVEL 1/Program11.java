
class Vehicle{
    protected int maxSpeed;
    protected String model;
    public Vehicle(int maxSpeed,String model){
        this.maxSpeed=maxSpeed;
        this.model=model;
    }
    public void display(){
        System.out.println("Maxspeed: "+maxSpeed);
        System.out.println("Model: "+model);
    }
}
interface Refuelable{
    void refuel();
}
class ElectricVehicle extends Vehicle{
    private int batteryCapacity;
    public ElectricVehicle(int maxSpeed,String model,int batteryCapacity){
        super(maxSpeed, model);
        this.batteryCapacity=batteryCapacity;
    }
    public void charge(){
        System.out.println(model+" is charging. Battery Capacity: "+batteryCapacity);
    }
}
class PetrolVehicle extends Vehicle implements Refuelable{
    private int tankCapacity;
    public PetrolVehicle(int maxSpeed,String model,int tankCapacity){
        super(maxSpeed, model);
        this.tankCapacity=tankCapacity;
    }
    @Override
    public void refuel(){
        System.out.println(model+" is refueling. Tank Capacity: "+tankCapacity);
    }

}

public class Program11 {
    public static void main(String[] args) {
        ElectricVehicle ev=new ElectricVehicle(150, "Ather", 75);
        PetrolVehicle pv=new PetrolVehicle(180, "Pulsar", 50);
        ev.display();
        ev.charge();
        System.out.println("----------------------------------");
        pv.display();
        pv.refuel();
       
    }
}



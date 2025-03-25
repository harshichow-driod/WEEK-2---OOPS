class HotelBooking{
    private String guestName;
    private String roomType;
    private int nights;

    HotelBooking(){
        guestName="Guest";
        roomType="Standard";
        nights=1;
    }
    HotelBooking(String guestName,String roomType,int nights){
        this.guestName=guestName;
        this.roomType=roomType;
        this.nights=nights;
    }
    HotelBooking(HotelBooking prev){
        this.guestName=prev.guestName;
        this.roomType=prev.roomType;
        this.nights=prev.nights;
    }
    public void display(){
        System.out.println("Guest Name: "+guestName);
        System.out.println("Room Type: "+roomType);
        System.out.println("Nights: "+nights);
    }
}
public class Program4 {
    public static void main(String[] args) {
        HotelBooking person1=new HotelBooking();
        System.out.println("Default:");
        person1.display();
        HotelBooking person2=new HotelBooking("Rakesh","Deluxe",3);
        System.out.println("Parametrized:");
        person2.display();
        HotelBooking person3=new HotelBooking(person2);
        System.out.println("Copy:");
        person3.display();
    }
    
}

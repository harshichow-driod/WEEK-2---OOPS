
class Person{
    protected String name;
    protected int id;
    public Person(String name,int id){
        this.name=name;
        this.id=id;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
    }
}
interface Worker{
    public void performDuties();
}
class Chef extends Person implements Worker{
    private String speciality;
    public Chef(String name,int id,String speciality){
        super(name, id);
        this.speciality=speciality;
    }
    @Override
    public void performDuties(){
        System.out.println(name+" is preparing dishes. Speciality: "+speciality);
    }

}
class Waiter extends Person implements Worker{
    private int tableCount;
    public Waiter(String name,int id,int tableCount){
        super(name, id);
        this.tableCount=tableCount;
    }
    @Override
    public void performDuties(){
        System.out.println(name+" is serving "+tableCount+" tables");
    }

}
public class Program10 {
    public static void main(String[] args) {
        Chef chef = new Chef("Gordon Ramsay", 101, "Italian Cuisine");
        Waiter waiter = new Waiter("John Doe", 201, 5);
        chef.display();
        chef.performDuties();
        System.out.println("--------------------------------------");
        waiter.display();
        waiter.performDuties();
    }
}


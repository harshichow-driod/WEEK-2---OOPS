class Person{
    private String name;
    private int age;

    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    Person(Person previous){
        this.name=previous.name;
        this.age=previous.age;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
public class Program3 {
    public static void main(String[] args) {
        Person p1=new Person("Rakesh",21);
        System.out.println("Parametrized Constructor:");
        p1.display();
        Person p2=new Person(p1);
        System.out.println("Copy Constructor:");
        p2.display();
    }
    
}

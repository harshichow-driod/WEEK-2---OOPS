class Circle {
    private double radius;
    Circle(){
        this(7);
    }
    Circle(double radius){
        this.radius=radius;
    }
    public void display(){
        System.out.println("Radius: "+radius);
    }
    
}
public class Program2{
    public static void main(String[] args) {
        Circle c1=new Circle();
        c1.display();
        Circle c2=new Circle(14);
        c2.display();
    }
}

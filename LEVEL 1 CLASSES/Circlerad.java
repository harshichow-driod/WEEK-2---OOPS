import java.util.Scanner;
class Circlerad{
    double radius;
Circlerad(double radius){
this.radius=radius;
}
double area(){
return Math.PI*radius*radius;
}
double circum(){
return  2*Math.PI*radius;
}
void display()
{
    System.out.println("PI value is : "+ Math.PI);
    System.out.println("Area of circle is : "+ area());
    System.out.println("Circumference of circle is : "+ circum());  
}
public static void main(String[]args){
Scanner scanner=new Scanner(System.in);
System.out.println("Enter radius : ");
double radius= scanner.nextDouble();
Circlerad rad=new Circlerad(radius);
rad.display();
}
}

class Student{
    public int rollNumber;
    protected String name;
    private double cgpa;

    Student(int rollNumber,String name,double cgpa){
        this.rollNumber=rollNumber;
        this.name=name;
        this.cgpa=cgpa;
    }
    public double getCGPA(){
        return cgpa;
    }
    public void setCGPA(double cgpa){
        if(cgpa>=0.0 && cgpa<=10.0)
            this.cgpa=cgpa;
        else System.out.println("Invalid cgpa");
    }
    public void display(){
        System.out.println("Roll Number: "+rollNumber);
        System.out.println("Name: "+name);
        System.out.println("CGPA: "+cgpa);
    }

}
class PostgraduateStudent extends Student{
    private String specialization;
    PostgraduateStudent(int rollNumber, String name, double cgpa,String specialization) {
        super(rollNumber, name, cgpa);
        this.specialization=specialization;
    }
    public void displayPostGraduate(){
        System.out.println("Post Graduate details");
        display();
        System.out.println("Specialization: "+specialization);
    }

    
}
public class Program10 {
    public static void main(String[] args) {
        Student s1=new Student(412, "Rakesh", 9.59);
        s1.display();
        s1.setCGPA(9.9);
        System.out.println("After update");
        s1.display();

        PostgraduateStudent p1=new PostgraduateStudent(409,"Harshi",9.5,"Iot");
        p1.displayPostGraduate();
    }
    
}

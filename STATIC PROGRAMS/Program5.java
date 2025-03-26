class Student{
    public static String universityName="SRM University";
    static int totalStudents=0;
    private String name;
    private final int rollNumber;
    private char grade;


    Student(String name,int rollNumber,char grade){
        this.name=name;
        this.rollNumber=rollNumber;
        this.grade=grade;
        totalStudents++;
    }
    public static void displayTotalStudents(){
        System.out.println("Total Students: "+totalStudents);
    }
    public void display(){
        if(this instanceof Student){
            System.out.println("University Name: "+universityName);
            System.out.println("Student Name: "+name);
            System.out.println("Roll Number: "+rollNumber);
            System.out.println("Grade: "+grade);
        }
    }
}
public class Program5 {
    public static void main(String[] args) {
        Student s1=new Student("Balaji",408,'A');
        System.out.println("Student 1 Details:");
        s1.display();
        Student s2=new Student("Mohan",401,'O');
        System.out.println("Student 2 Details:");
        s1.display();
        Student.displayTotalStudents();

    }
   
}


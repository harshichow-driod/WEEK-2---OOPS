
class Person{
    protected String name;
    protected int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
}
class Teacher extends Person{
    private String subject;
    public Teacher(String name, int age,String subject) {
        super(name, age);
        this.subject=subject;
    }
    public void displayRole(){
        System.out.println("Role: Teacher");
        super.display();
        System.out.println("Subject: "+subject);
    }
}
class Student extends Person{
    private char grade;
    public Student(String name, int age,char grade) {
        super(name, age);
        this.grade=grade;
    }
    public void displayRole(){
        System.out.println("Role: Student");
        super.display();
        System.out.println("Grade: "+grade);
    }
}
class Staff extends Person{
    private String staffId;
    public Staff(String name, int age,String staffId) {
        super(name, age);
        this.staffId=staffId;
    }
    public void displayRole(){
        System.out.println("Role: Staff");
        super.display();
        System.out.println("Staff ID: "+staffId);
    }
}
public class Program9 {
    public static void main(String[] args) {
        Teacher teacher=new Teacher("Rajesh", 40, "CSC");
        Student student=new Student("Rakesh", 21, 'A');
        Staff staff=new Staff("Harshi", 24, "409");
        teacher.displayRole();
        System.out.println("--------------------------------------");
        student.displayRole();
        System.out.println("--------------------------------------");
        staff.displayRole();
    }
}



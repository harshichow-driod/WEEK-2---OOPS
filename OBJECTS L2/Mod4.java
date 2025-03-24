class Employee{
    public int employeeID;
    protected String department;
    private double salary;

    Employee(int employeeID,String department,double salary){
        this.employeeID=employeeID;
        this.department=department;
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
    public void updateSalary(double newSalary){
        if(newSalary>0){
            salary=newSalary;
            System.out.println("Salary Updated");
        }
        else System.out.println("Invalid Salary");
    }
    public void display(){
        System.out.println("Employee ID: "+employeeID);
        System.out.println("Department: "+department);
        System.out.println("Salary: "+salary);
    }
}
class Manager extends Employee{
    private String team;
    Manager(int employeeID,String department,double salary,String team){
        super(employeeID, department, salary);
        this.team=team;
    }
    public void displayManager(){
        display();
        System.out.println("Team: "+team);
    }
}
public class Mod4 {
    public static void main(String[] args) {
        Employee person1=new Employee(21,"HR",30000);
        person1.display();
        person1.updateSalary(35000);
        System.out.println("After Salary update:");
        person1.display();
        Manager m1=new Manager(202, "IT", 80000, "Development Team");
        m1.displayManager();
    }
   
}
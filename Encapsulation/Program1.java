abstract class Employee implements Department{
    private int employeeId;
    private String name;
    private double baseSalary;
    private String department;
    public Employee(int employeeId,String name,double basesSalary){
        this.employeeId=employeeId;
        this.name=name;
        this.baseSalary=basesSalary;
    }
    public abstract double calculateSalary();
    public int getEmployeeId(){
        return employeeId;
    }
    public String getName(){
        return getName();
    }
    public double getBaseSalary(){
        return baseSalary;
    }
    @Override
    public void assignDepartment(String departmentName){
        this.department=departmentName;
    }
    @Override
    public String getDepartmentDetails(){
        return department;
    }
    public void displayDetails(){
        System.out.println("Employee ID: "+employeeId);
        System.out.println("Name: "+name);
        System.out.println("Base Salary: "+baseSalary);
        System.out.println("Department: "+department);
        System.out.println("Salary: "+calculateSalary());
    }
}
interface Department{
    void assignDepartment(String departmentName);
    String getDepartmentDetails();
    
}
class FullTimeEmployee extends Employee{
    private double bonus;
    public FullTimeEmployee(int employeeId,String name,double baseSalary,double bonus){
        super(employeeId, name, baseSalary);
        this.bonus=bonus;
    }
    @Override
    public double calculateSalary() {
        return getBaseSalary()+bonus;
    }

}
class PartTimeEmployee extends Employee{
    private int workedhours;
    private int hourlyrate;
    public PartTimeEmployee(int employeeId,String name,double baseSalary,int workedhours,int hourlyrate){
        super(employeeId, name, baseSalary);
        this.workedhours=workedhours;
        this.hourlyrate=hourlyrate;
    }
    @Override
    public double calculateSalary() {
        return getBaseSalary()+(workedhours*hourlyrate);
    }
    
}
public class Program1{
    public static void main(String[] args) {
        Employee emp1=new FullTimeEmployee(123,"Rakesh",18000,2000);
        emp1.assignDepartment("IT");
        Employee emp2=new PartTimeEmployee(456,"Harshi",15000,6,200);
        emp2.assignDepartment("Customer Support");
        emp1.displayDetails();
        System.out.println("-------------------------------------------");
        emp2.displayDetails();
    }
}

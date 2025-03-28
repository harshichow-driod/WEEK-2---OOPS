class Employee{
    public String name;
    public int id;
    public double salary;
    public Employee(String name,int id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("Employee ID: "+id);
        System.out.println("Salary: "+salary);
    }
}
class Manager extends Employee{
    public String teamName;
    public int teamSize;
    public Manager(String name,int id,double salary,String teamName,int teamSize){
        super(name,id,salary);
        this.teamName=teamName;
        this.teamSize=teamSize;
    }
    @Override
    public void displayDetails(){
        System.out.println("Manager Name: "+name);
        System.out.println("Employee ID: "+id);
        System.out.println("Salary: "+salary);
        System.out.println("Team Name: "+teamName);
        System.out.println("Team Size: "+teamSize);
    }
}
class Developer extends Employee{
    public String programmingLanguage;
    public Developer(String name,int id,double salary,String programmingLanguage){
        super(name,id,salary);
        this.programmingLanguage=programmingLanguage;
    }
    @Override
    public void displayDetails(){
        System.out.println("Developer Name: "+name);
        System.out.println("Employee ID: "+id);
        System.out.println("Salary: "+salary);
        System.out.println("Programming Language:"+programmingLanguage);
    }
}
class Intern extends Employee{
    public String domain;
    public Intern(String name,int id,double salary,String domain){
        super(name,id,salary);
        this.domain=domain;
    }
    @Override
    public void displayDetails(){
        System.out.println("Intern Name: "+name);
        System.out.println("Intern ID: "+id);
        System.out.println("Stipend: "+salary);
        System.out.println("Domain: "+domain);
    }
}
public class Program2 {
    public static void main(String[] args) {
        Employee emp=new Employee("Rakesh", 412, 30000);
        Manager manager=new Manager("Monesh", 308, 50000, "Cloud Team", 10);
        Developer developer=new Developer("Aliya", 400, 38000, "Java");
        Intern intern=new Intern("Ben", 1101, 12000, "Cloud Computing");
        emp.displayDetails();
        manager.displayDetails();
        developer.displayDetails();
        intern.displayDetails();
    }
}
   

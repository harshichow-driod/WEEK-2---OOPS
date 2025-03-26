class Employee{
    public static String companyName="Capgemini";
    private String name;
    private final int id;
    private String designation;
    Employee(String name,int id,String designation){
        this.name=name;
        this.id=id;
        this.designation=designation;
    }

    public static void displayCompanyName(){
        System.out.println("Company Name: "+companyName);
    }
    public void display(){
        if(this instanceof Employee){
            System.out.println("Name: "+name);
            System.out.println("ID: "+id);
            System.out.println("Designation: "+designation);
        }
    }
}
public class Program3 {
    public static void main(String[] args) {
        Employee e1=new Employee("Rakii",412,"Senior Executive");
        Employee.displayCompanyName();
        e1.display();
    }
}


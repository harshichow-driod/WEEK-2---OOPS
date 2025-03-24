class Employee{
    String name;
    int id;
    int salary;
Employee(String name,int id,int salary)
{
    this.name=name;
    this.id=id;
    this.salary=salary;
}
void print()
{
    System.out.println("Employee name : " + name);
    System.out.println("Employee ID : " + id);
    System.out.println("Employee salary : " + salary);
}
public static void main(String[]args)
{
    Employee emp1=new Employee("Harshi",21,30000);
    emp1.print();
}
}

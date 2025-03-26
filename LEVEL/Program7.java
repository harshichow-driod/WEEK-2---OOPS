class Patient{
    static String hospitalName="SRM Hospital";
    private String name;
    private int age;
    private String ailment;
    private final String patientID;
    static int totalPatients=0;

    Patient(String name,int age,String ailment,String patientID){
        this.name=name;
        this.age=age;
        this.ailment=ailment;
        this.patientID=patientID;
        totalPatients++;
    }
    public static void getTotalPtients(){
        System.out.println("Total Patients: "+totalPatients);
    }
    public void display(){
        if(this instanceof Patient){
            System.out.println("Hospital Name: "+hospitalName);
            System.out.println("Patient Name: "+name);
            System.out.println("Patient ID: "+patientID);
            System.out.println("Age: "+age);
            System.out.println("Ailment: "+ailment);
        }
    }
}
public class Program7{
    public static void main(String[] args){
        Patient p1=new Patient("John Doe", 45, "Flu", "P001");
        p1.display();
        Patient p2=new Patient("Jane Smith", 30, "Fracture", "P002");
        System.out.println("");
        p2.display();
        Patient.getTotalPtients();
    }
}



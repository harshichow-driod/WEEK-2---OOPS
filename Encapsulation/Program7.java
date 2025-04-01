import java.util.ArrayList;

abstract class Patient implements MedicalRecord{
    private int patientId;
    private String name;
    private int age;
    private ArrayList<String> medicalRecords;
    public Patient(int patientId,String name,int age){
        this.patientId=patientId;
        this.name=name;
        this.age=age;
        this.medicalRecords=new ArrayList<>();
    }
    public abstract double calculateBill();
    public void getPatientdisplay(){
        System.out.println("Patient ID: "+patientId);
        System.out.println("Name: "+name);
        System.out.println("Age: "+age);
    }
    @Override
    public void addRecord(String record){
        medicalRecords.add(record);
    }
    @Override
    public void viewRecords(){
        System.out.println("Medical Records for "+name);
        for(String record:medicalRecords){
            System.out.println(record);
        }
    }
}
class InPatient extends Patient{
    private int daysAdmitted;
    private double roomCharge;
    public InPatient(int patientId, String name, int age,int daysAdmitted,double roomCharge) {
        super(patientId, name, age);
        this.daysAdmitted=daysAdmitted;
        this.roomCharge=roomCharge;
    }

    @Override
    public double calculateBill() {
        return daysAdmitted*roomCharge;
    }
    
}
class OutPatient extends Patient{
    private double consultationFee;
    public OutPatient(int patientId, String name, int age,double consultationFee) {
        super(patientId, name, age);
        this.consultationFee=consultationFee;
    }

    @Override
    public double calculateBill() {
        return consultationFee;
    }
    
}
interface MedicalRecord{
    void addRecord(String record);
    void viewRecords();
}
public class Program7 {
    public static void main(String[] args) {
        Patient p1=new InPatient(123, "Aliya", 21, 10, 700);
        Patient p2=new OutPatient(456, "Jai", 22, 300);
        Patient[] patients={p1,p2};
        for(Patient p:patients){
            p.getPatientdisplay();
            p.addRecord("Routine Checkup");
            p.addRecord("Prescribed Medication");
            p.viewRecords();
            System.out.println("BILL AMOUNT:"+p.calculateBill());
            System.out.println("--------------------------------------");
        }
    }
}

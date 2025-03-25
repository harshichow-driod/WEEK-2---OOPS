class Course{
    private String courseName;
    private int duration;
    private int fee;
    static String instituteName;
    
    Course(String courseName,int duration,int fee){
        this.courseName=courseName;
        this.duration=duration;
        this.fee=fee;
        instituteName="SRM";
    }
    public void displayCourseDetails(){
        System.out.println("Course Name: "+courseName);
        System.out.println("Duration: "+duration);
        System.out.println("Fee: "+fee);
        System.out.println("Institute Name: "+instituteName);
    }
    static void updateInstituteName(String update){
        instituteName=update;
    }
}
public class Program8 {
    public static void main(String[] args) {
        Course c1=new Course("Python",6,5000);
        c1.displayCourseDetails();
        Course c2=new Course("Data Science",12,25000);
        Course.updateInstituteName("VIT");
        c2.displayCourseDetails();
    }
}

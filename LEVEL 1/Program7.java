class Course{
    protected String courseName;
    protected int duration;
    public Course(String courseName,int  duration){
        this.courseName=courseName;
        this.duration=duration;
    }
    public void displayInfo(){
        System.out.println("Course Name: "+courseName);
        System.out.println("Duration: "+duration);
    }
}
class OnlineCourse extends Course{
    protected String platform;
    protected boolean isRecorded;
    public OnlineCourse(String courseName,int  duration,String platform,boolean isRecorded){
        super(courseName, duration);
        this.platform=platform;
        this.isRecorded=isRecorded;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Platform: "+platform);
        System.out.println("Is Recorded? "+(isRecorded? "Yes":"No"));
    }
}
class PaidOnlineCourse extends OnlineCourse{
    private double fee;
    private double discount;
    public PaidOnlineCourse(String courseName,int  duration,String platform,boolean isRecorded,double fee,double discount){
        super(courseName, duration, platform, isRecorded);
        this.fee=fee;
        this.discount=discount;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Fee: "+fee);
        System.out.println("Discount: "+discount);
        System.out.println("Final Fee: "+(fee-(fee*discount/100)));
    }
}
public class Program7 {
    public static void main(String[] args) {
        PaidOnlineCourse course = new PaidOnlineCourse("Full Stack Development",120,"Coursera",true,399.99,20.0);
        course.displayInfo();
    }
}


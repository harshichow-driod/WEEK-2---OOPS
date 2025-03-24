import java.util.Scanner;

class student {
    String name;
    String rollNumber;
    int marks;
    char grade;

    student(String name, String rollNumber, int marks) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.marks = marks;
        this.grade = calculateGrade();
    }

    char calculateGrade() {
        if (marks >= 90)
            return 'A';
        else if (marks >= 80)
            return 'B';
        else if (marks >= 70)
            return 'C';
        else if (marks >= 60)
            return 'D';
        else if (marks >= 50)
            return 'E';
        else
            return 'F';
    }

    void displayDetails() {
      
        System.out.println("Name       : " + name);
        System.out.println("Roll No.   : " + rollNumber);
        System.out.println("Marks      : " + marks);
        System.out.println("Grade      : " + grade);
    
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        System.out.print("Enter roll number: ");
        String rollNumber = sc.nextLine();

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        student student = new student(name, rollNumber, marks);
        student.displayDetails();
    }
}

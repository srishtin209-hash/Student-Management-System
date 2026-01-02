import java.util.ArrayList;
import java.util.Scanner;
/* -----ABSTRACTION-----*/
abstract class Person{
    protected String name;
    protected String usn;
    abstract void displayDetails();
}
/* -----ENCAPSULATION+INHERITANCE -----*/
class Student extends Person{
    private int marks;
    public Student(String name,String usn,int marks) {
        this.name=name;
        this.usn=usn;
        this.marks=marks;
    }
    public int getMarks(){
        return marks;
    }
    public void setMarks(int marks){
        this.marks=marks;
    }
    String calculateGrade(){
        if(marks>=75)
            return "A";
        else if(marks>=60)
            return "B";
        else if(marks>=40)
            return "C";
        else
            return "Fail";
    }
    @Override
    void displayDetails(){
        System.out.println("Name:"+name);
        System.out.println("USN:"+usn);
        System.out.println("Marks:"+marks);
    }
}
/* -----POLYMORPHISM -----*/
class EngineeringStudent extends Student{
    private String branch;
    public EngineeringStudent(String name,String usn,int marks,String branch){
        super(name,usn,marks);
        this.branch=branch;
    }
    @Override
    String calculateGrade(){
        return super.calculateGrade()+"(Engineering)";
    }
    @Override
    void displayDetails(){
        super.displayDetails();
        System.out.println("Branch:"+branch);
        System.out.println("Grade:"+calculateGrade());
    }
}
/* -----DATA STRUCTURE-----*/
class StudentManager{
    ArrayList<EngineeringStudent>students=new ArrayList<>();
    void addStudent(EngineeringStudent s){
        students.add(s);
    }
    void displayAllStudents(){
        if (students.isEmpty()){
            System.out.println("No student records available.");
            return;
        }
        for (EngineeringStudent s:students){
            s.displayDetails();
            System.out.println("-----------");
        }
    }
}
/*-----MAIN CLASS-----*/
public class StudentManagementSystem{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        StudentManager manager=new StudentManager();
        while (true){
            System.out.println("\n---Student Management System---");
            System.out.println("1.Add Student");
            System.out.println("2.Display All Students");
            System.out.println("3.Exit");
            System.out.print("Enter choice:");
            int choice=sc.nextInt();
            sc.nextLine();
            switch(choice){
                case 1:
                    System.out.print("Enter Name:");
                    String name=sc.nextLine();
                    System.out.print("Enter USN:");
                    String usn=sc.nextLine();
                    System.out.print("Enter Marks:");
                    int marks=sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Branch:");
                    String branch=sc.nextLine();
                    EngineeringStudent es =new EngineeringStudent(name,usn,marks,branch);
                    manager.addStudent(es);
                    System.out.println("Student added successfully");
                    break;
                case 2:
                    manager.displayAllStudents();
                    break;
                case 3:
                    System.out.println("Exiting program");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
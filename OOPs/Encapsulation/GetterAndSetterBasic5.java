import java.util.*;
class Student{
    private String name;
    private double marks;
    void setStudent(String name,double marks){
        this.name=name;
        if(marks>0 && marks<100){
            this.marks=marks;
        }
        else{
            System.out.println("Invalid Marks");
        }
    }
    String getName(){
        return name;
    }
    double getMarks(){
        return marks;
    }
}
public class GetterAndSetterBasic5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student s=new Student();
        System.out.print("Enter Student Name: ");
        String name=sc.nextLine();
        System.out.print("Enter Student Marks: ");
        double marks=sc.nextDouble();
        s.setStudent(name,marks);
        System.out.println("The student name is: "+s.getName());
        System.out.println("The student marks are: "+s.getMarks());
    }
}

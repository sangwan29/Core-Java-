import java.util.*;
class Student{
    private int marks=0;
    void setMarks(int marks){
        this.marks = marks;
    }
    int getMarks(){
        return marks;
    }
}
public class GetterAndSetterBasic7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Student s=new Student();
        System.out.println("The default value is: "+s.getMarks());
        System.out.print("Enter marks: ");
        int marks=sc.nextInt();
        s.setMarks(marks);
        System.out.println("The value after setting is: "+s.getMarks());
    }
}

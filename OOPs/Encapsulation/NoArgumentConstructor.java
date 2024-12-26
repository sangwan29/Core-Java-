class Student{
    Student(){
        String name="Anonymous";
        int marks=0;
        System.out.println("The student name is: "+name+" and the marks is: "+marks);
    }
}
public class NoArgumentConstructor {
    public static void main(String[] args) {
        new Student();
    }
}

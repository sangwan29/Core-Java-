class Student{
    String name;
    int marks;
    Student(){
        name = "Unknown";
        System.out.println("The name is: "+name+" and the marks is: "+marks);
    }
}
public class ConstructorDefault {
    public static void main(String[] args) {
        new Student();
    }
}

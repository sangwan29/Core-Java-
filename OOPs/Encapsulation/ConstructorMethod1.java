import java.util.*;
class Person{
    String name;
    int age;
    Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    void displayInfo(){
        System.out.println("The name is: "+name+" and the age is: "+age);
    }
}
public class ConstructorMethod1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=sc.nextLine();
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        Person p=new Person(name,age);
        p.displayInfo();
    }
}

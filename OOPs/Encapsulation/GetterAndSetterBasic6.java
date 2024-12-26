import java.util.*;
class Person{
    private int age;
    void setAge(int age){
        if(age>0 && age<130){
            this.age = age;
        }
        else{
            System.out.println("Invalid age");
        }
    }
    int getAge(){
        return age;
    }
}
public class GetterAndSetterBasic6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Person p=new Person();
        System.out.print("Enter your age: ");
        int age=sc.nextInt();
        p.setAge(age);
        System.out.println("The age is: "+p.getAge());
    }
}

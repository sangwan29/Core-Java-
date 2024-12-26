import java.util.*;
class Person{
    private String name;
    private int age;
    void setA(String name,int age){
        this.name=name;
        this.age=age;       
    }
    String getname(){
        return name;
    }
    int getage(){
        return age;
    }
}
public class GetterAndSetterBasic1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name: ");
        String name=sc.nextLine();
        System.out.print("Enter the age: ");
        int age=sc.nextInt();
        Person p=new Person();
        p.setA(name, age);
        System.out.println(p.getname());
        System.out.println(p.getage());
    }
}

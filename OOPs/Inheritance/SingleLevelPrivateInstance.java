import java.util.*;
class A{
    private String name;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
}
class B extends A{
    private String hello;
    void setname(String hello){
        this.hello=hello;
    }
    String getname(){
        return hello;
    }

}
public class SingleLevelPrivateInstance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string: ");
        String name=sc.nextLine();
        System.out.print("Enter the string: ");
        String hello=sc.nextLine();
        B b=new B();
        b.setName(name);
        b.setname(hello);
        System.out.println("The class A: "+b.getName());
        System.out.println("The class B: "+b.getname());
    }
}

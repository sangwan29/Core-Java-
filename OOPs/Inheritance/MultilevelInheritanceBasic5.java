import java.util.*;
class A{
    A(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("The addition is: "+c);
    }
}
class B extends A{
    B(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b=sc.nextInt();
        int c=a*b;
        System.out.println("The multiplication is: "+c);
    }
}
class C extends B{
    C(){
        System.out.println("This is C class default constructor");
    }
}
public class MultilevelInheritanceBasic5 {
    public static void main(String[] args) {
        new C();
    }
}

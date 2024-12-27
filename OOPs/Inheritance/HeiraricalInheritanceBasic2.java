import java.util.*;
class A{
    A(){
        System.out.println("The default constructor in class A");
    }
    void methodA(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("The addition is(class A): "+c);
    }
}
class B extends A{
    B(){
        System.out.println("The default constructor in class B");
    }
}
class C extends A{
    C(){
        System.out.println("The default constructor in class C");
    }
}
class D extends A{
    D(){
        System.out.println("The default constructor in class D");
    }
}
public class HeiraricalInheritanceBasic2 {
    public static void main(String[] args) {
        B b=new B();
        b.methodA();
        C c=new C();
        c.methodA();
        D d=new D();  
        d.methodA();     
    }
}

import java.util.*;
class A{
    A(int a,int b){
        int c=a+b;
        System.out.println("The sum is: "+c);
    }
}
class B{
    B(int a,int b){
        int c=a-b;
        System.out.println("The difference is: "+c);
    }
}
class C{
    C(int a,int b){
        int c=a*b;
        System.out.println("The product is: "+c);
    }
}
class D{
    D(int a,int b){
        int c=a/b;
        System.out.println("The division is: "+c);
    }
}
public class ParameterizedConstructor{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a and b: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        new A(a,b);
        new B(a,b);
        new C(a,b);
        new D(a,b);
    }
}
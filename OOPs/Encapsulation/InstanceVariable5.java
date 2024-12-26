import java.util.*;
class A{
    int a,b;
    A(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("The sum is: "+(a+b));
    }
}
class B{
    int a,b;
    B(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("The difference is: "+(a-b));
    }
}
class C{
    int a,b;
    C(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("The product is: "+(a*b));
    }
}
class D{
    int a,b;
    D(int a,int b){
        this.a=a;
        this.b=b;
        System.out.println("The division is: "+(a/b));
    }
}
public class InstanceVariable5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a and b is: ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        new A(a,b);
        new B(a,b);
        new C(a,b);
        new D(a,b);
    }
}

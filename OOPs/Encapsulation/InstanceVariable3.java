import java.util.*;
class A{
    int a,b;
    A(int x,int y){
        a=x;
        b=y;
        System.out.println("The sum is: "+(a+b));
    }
}
class B{
    int c,d;
    B(int x,int y){
        c=x;
        d=y;
        System.out.println("The subtraction is: "+(c-d));
    }
}
class C{
    int e,f;
    C(int x,int y){
        e=x;
        f=y;
        System.out.println("The multiplication is: "+(e*f));
    }
}
class D{
    int g,h;
    D(int x,int y){
        g=x;
        h=y;
        System.out.println("The division is: "+(g/h));
    }
}
public class InstanceVariable3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of x and y: ");
        int x=sc.nextInt();
        int y=sc.nextInt();
        new A(x,y);
        new B(x,y);
        new C(x,y);
        new D(x,y);
    }
}

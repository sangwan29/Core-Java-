import java.util.*;
class A{
    int add(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        int c=a+b;
        return c;
    }
    int sub(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        int c=a-b;
        return c;
    }
    int multi(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        int c=a*b;
        return c;
    }
    int div(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a=sc.nextInt();
        System.out.print("Enter second number: ");
        int b=sc.nextInt();
        int c=a/b;
        return c;
    }
}
class B{
    int even(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("number is even");
        }
        return num;
    }
}
class C{
    int odd(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num=sc.nextInt();
        if(num%2!=0){
            System.out.println("number is odd");
        }
        return num;
    }
}
public class Method10 {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.add());
        System.out.println(a.sub());
        System.out.println(a.multi());
        System.out.println(a.div());
        B b=new B();
        b.even();
        C c=new C();
        c.odd();
    }
}

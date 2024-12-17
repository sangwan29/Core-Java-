import java.util.*;
class A{
    void add(){
        Scanner sc = new Scanner(System.in);
        System.out.print("For addition:");
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("Sum is " + sum);
    }
    void sub(){
        Scanner sc = new Scanner(System.in);
        System.out.print("For subtraction:");
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int sub=a-b;
        System.out.println("Sub is " + sub);
    }
    void multi(){
        Scanner sc = new Scanner(System.in);
        System.out.print("For multiplication:");
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int mul=a*b;
        System.out.println("Multiplication is " + mul);
    }
    void div(){
        Scanner sc = new Scanner(System.in);
        System.out.print("For division:");
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        int div=a/b;
        System.out.println("Division is " + div);
    }
}
class B{
    void even(){
        Scanner sc = new Scanner(System.in);
        System.out.print("For Even number:");
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if(a%2==0){
            System.out.println("Number is even");
        }
    }
}
class C{
    void odd(){
        Scanner sc = new Scanner(System.in);
        System.out.print("For Odd number:");
        System.out.println("Enter a number");
        int a = sc.nextInt();
        if(a%2!=0){
            System.out.println("Number is odd");
        }
    }
}
public class Method4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);  
        A obj=new A();
        obj.add();
        obj.sub();
        obj.multi();
        obj.div();
        B obj1=new B();
        obj1.even();
        C obj2=new C();
        obj2.odd();
    }
}

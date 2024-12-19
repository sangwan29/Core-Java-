import java.util.*;
class A{
    void add(int a,int b){
        int c=a+b;
        System.out.println("The addition of a and b is: "+c);
    }
    void sub(int a,int b){
        int c=a-b;
        System.out.println("The subtraction of a and b is: "+c);
    }
    void multi(int a,int b){
        int c=a*b;
        System.out.println("The product of a and b is: "+c);
    }
    void div(int a,int b){
        int c=a/b;
        System.out.println("The division of a and b is: "+c);
    }
}
class B{
    void even(int num){
        if(num%2==0){
            System.out.println(num+" number is even");
        }
    }
}
class C{
    void odd(int num){
        if(num%2!=0){
            System.out.println(num+" number is odd");
        }
    }
}
public class Method6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b=sc.nextInt();
        A s=new A();
        s.add(a,b);
        s.sub(a,b);
        s.multi(a,b);
        s.div(a,b);
        System.out.print("Enter the value of num: ");
        int num=sc.nextInt();
        B p=new B();
        p.even(num);
        C f=new C();
        f.odd(num);
    }
}

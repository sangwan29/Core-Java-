import java.util.*;
class A{
    int add(int a,int b){
        int c=a+b;
        System.out.println(c);
        return c;
    }
    int sub(int a,int b){
        int c=a-b;
        System.out.println(c);
        return c;
    }
    int multi(int a,int b){
        int c=a*b;
        System.out.println(c);
        return c;
    }
    int div(int a,int b){
        int c=a/b;
        System.out.println(c);
        return c;
    }
}
class B{
    int even(int num){
        if(num%2==0){
            System.out.println(num+" is even");
        }
        return num;
    }
}
class C{
    int odd(int num){
        if(num%2!=0){
            System.out.println(num+" is odd");
        }
        return num;
    }
}
public class Method14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        A p=new A();
        B f=new B();
        C c=new C();
        System.out.println("Enter the first number");
        int a=sc.nextInt();
        System.out.println("Enter the second number");
        int b=sc.nextInt();
        p.add(a,b);
        p.sub(a,b);
        p.multi(a,b);
        p.div(a,b);
        System.out.println("Enter the value of num: ");
        int num=sc.nextInt();
        f.even(num);
        c.odd(num);

    }
}

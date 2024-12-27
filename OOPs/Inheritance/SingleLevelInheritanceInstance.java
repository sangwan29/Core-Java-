import java.util.*;
class A{
    int num1;
    int num2;
    void add(int a,int b){
        num1=a;
        num2=b;
        System.out.println("The addition is: "+(num1+num2));
    }
}
class B extends A{
    void sub(int a,int b){
        num1=a;
        num2=b;
        System.out.println("The substraction is: "+(num1-num2));
    }
}
public class SingleLevelInheritanceInstance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a=sc.nextInt();
        System.out.print("Enter the value of b: ");
        int b=sc.nextInt();
        B p=new B();
        p.add(a,b);
        p.sub(a,b);
    }
}

import java.util.*;
class A{
    A(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2=sc.nextInt();
        int multi=num1*num2;
        System.out.println("The multiplication of two numbers is: "+multi);
    }
}
class B extends A{
    B(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1=sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2=sc.nextInt();
        int div=num1/num2;
        System.out.println("The division of two numbers is: "+div);
    }
}
public class SingleLevelDefaultConstructor {
    public static void main(String[] args) {
        B p=new B();
    }
}

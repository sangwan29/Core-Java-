import java.util.*;
public class SwapWith {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a=sc.nextInt();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        int c;
        c=a;
        a=b;
        b=c;
        System.out.println("The value of a is "+a+" and the value of b is "+b+" after swapping");

    }
}

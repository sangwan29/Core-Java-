import java.util.*;
public class Operator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System .out.println("Enter the value of num1 and num2:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int num3;
        num3=num1+num2;
        System.out.println("The addition of num1 and num2 is: "+num3);
        num3=num1-num2;
        System.out.println("The subtraction of num1 and num2 is: "+num3);
        num3=num1*num2;
        System.out.println("The product of num1 and num2 is: "+num3);
        num3=num1/num2;
        System.out.println("The division of num1 and num2 is: "+num3);
    }
}

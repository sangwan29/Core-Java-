import java.util.Scanner;
public class UserProblem9{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        float a=sc.nextFloat();
        System.out.println("Enter second number:");
        float b=sc.nextFloat();
        System.out.println("Enter third number:");
        float c=sc.nextFloat();
        System.out.println("Enter fourth number:");
        float d=sc.nextFloat();
        System.out.println("Enter fifth number:");
        float e=sc.nextFloat();
        System.out.println("Enter sixth number:");
        int f=sc.nextInt();
        System.out.println("Enter seventh number:");
        int g=sc.nextInt();
        float h=a*b-(c-d)+e-f+g;
        System.out.println("Result:"+h);
    }
}
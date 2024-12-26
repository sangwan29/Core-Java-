import java.util.Scanner;
public class UserProblem6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        float a=sc.nextFloat();
        System.out.println("Enter second number:");
        float b=sc.nextFloat();
        System.out.println("Enter third number:");
        int c=sc.nextInt();
        System.out.println("Enter fourth number:");
        int d=sc.nextInt();
        System.out.println("Enter fifth number:");
        float e=sc.nextFloat();
        System.out.println("Enter sixth number:");
        float f=sc.nextFloat();
        float g=a*b-(c/d)/e+f;
        System.out.println("Result:"+g);
    }
}
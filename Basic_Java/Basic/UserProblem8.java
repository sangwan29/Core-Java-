import java.util.Scanner;
public class UserProblem8{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter first number:");
        float a=sc.nextFloat();
        System.out.println("Enter second number:");
        float b=sc.nextFloat();
        System.out.println("Enter third number:");
        float c=sc.nextFloat();
        System.out.println("Enter fourth number:");
        float d=sc.nextFloat();
        System.out.println("Enter fifth number:");
        int e=sc.nextInt();
        System.out.println("Enter sixth number:");
        float f=sc.nextFloat();
        float g=a+b*(c-d)/e+f;
        System.out.println("Result: "+g);
    }
}
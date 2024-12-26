import java.util.Scanner;
public class UserProblem4{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number:");
        float a=sc.nextFloat();
        System.out.println("Enter second number:");
        float b=sc.nextFloat();
        System.out.println("Enter third number:");
        float c=sc.nextFloat();
        System.out.println("Enter fourth number:");
        int d=sc.nextInt();
        float e=a*b-c/d;
        System.out.println("Result:"+e);
    }
}
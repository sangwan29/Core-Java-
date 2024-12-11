import java.util.Scanner;
public class UserProblem5{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        float a=sc.nextFloat();
        System.out.println("Enter the second number:");
        int b=sc.nextInt();
        System.out.println("Enter the third number:");
        int c=sc.nextInt();
        System.out.println("Enter fourth number:");
        float d=sc.nextFloat();
        System.out.println("Enter fifth number:");
        float e=sc.nextFloat();
        float f=a*(b-c)/c+d-e;
        System.out.println("Result:"+f);
    }
}
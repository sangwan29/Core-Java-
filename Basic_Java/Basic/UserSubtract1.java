import java.util.Scanner;
public class UserSubtract1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a is:");
        int a= sc.nextInt();
        System.out.println("Enter the value of b is:");
        int b=sc.nextInt();
        int c=a-b;
        System.out.println("The subtraction of two numbers is:"+c);
    }
}
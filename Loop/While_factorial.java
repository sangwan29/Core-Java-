import java.util.*;
public class While_factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        int i = 1;
        int fact = 1;
        while (i <= n) {
            fact = fact * i;
            i++;
        }
        System.out.println("Factorial of " + n + " is " + fact);
    }   
}

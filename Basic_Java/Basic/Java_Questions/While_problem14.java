import java.util.Scanner;
public class While_problem14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int sum = 0,rem;
        while (number > 0) {
            rem=number%10;
            sum=sum+rem;
            number=number/10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}

import java.util.Scanner;
public class While_problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int product = 1,rem;
        while (number > 0) {
            rem=number%10;
            product=product*rem;
            number=number/10;
        }
        System.out.println("Sum of digits: " + product);
    }
}
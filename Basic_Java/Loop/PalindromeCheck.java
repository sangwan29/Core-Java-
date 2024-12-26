import java.util.Scanner;
public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number:");
        int n = sc.nextInt();
        if (n < 0) {
            System.out.println("Invalid Input");
        } 
        else {
            int temp = n;
            int sum = 0;
            while (n> 0) {
                int rem = n % 10; 
                sum = sum * 10 + rem; 
                n=n/10; 
            }
            if (temp == sum) {
                System.out.println("Palindrome");
            } 
            else {
                System.out.println("Not a Palindrome");
            }
        }
    }
}


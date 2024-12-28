import java.util.Scanner;
public class While_problem11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); 
        int lastDigit = number % 10;
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit=firstDigit / 10;
        }
        System.out.println("First digit: " + firstDigit);
        System.out.println("Last digit: " + lastDigit);
    }
}


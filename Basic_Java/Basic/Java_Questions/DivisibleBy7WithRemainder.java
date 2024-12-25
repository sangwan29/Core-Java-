import java.util.Scanner;
public class DivisibleBy7WithRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first integer: ");
        int firstNumber = sc.nextInt();
        System.out.print("Input the second integer: ");
        int secondNumber = sc.nextInt();
        System.out.println("Numbers divisible by 7 with remainder 2 or 3:");
        for (int i = firstNumber; i <= secondNumber; i++) {
            if (i % 7 == 2 || i % 7 == 3) {
                System.out.println(i);
            }
        }
    }
}


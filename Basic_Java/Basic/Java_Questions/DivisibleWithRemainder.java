import java.util.Scanner;
public class DivisibleWithRemainder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int divisor = sc.nextInt();
        System.out.println("Numbers between 1 and 100 that, when divided by " + divisor + ", have a remainder of 3:");
        for (int i = 1; i <= 100; i++) {
            if (i % divisor == 3) {
                System.out.println(i);
            }
        }
    }
}


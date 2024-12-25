import java.util.Scanner;
public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the base number: ");
        int base = sc.nextInt();
        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt();
        long result = 1;
        for (int i = 1; i <= exponent; i++) {
            result=result * base;
        }
        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}


import java.util.Scanner;
public class SumOddValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Input number " + i + ": ");
            int number = sc.nextInt();
            if (number % 2 != 0) {
                sum=sum + number; 
            }
        }
        System.out.println("Sum of all odd values: " + sum);
    }
}

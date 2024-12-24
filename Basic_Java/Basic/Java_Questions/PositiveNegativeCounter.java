import java.util.Scanner;
public class PositiveNegativeCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int positiveCount = 0;
        int negativeCount = 0;
        for (int i = 1; i <= 5; i++) {
            System.out.print("Input number " + i + ": ");
            int number = sc.nextInt();
            if (number > 0) {
                positiveCount++;
            } 
            else if (number < 0) {
                negativeCount++;
            }
        }
        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
    }
}


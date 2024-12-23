import java.util.Scanner;
public class PositiveNumbersAverageBasic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int countPositive = 0;
        int sumPositive = 0;
        System.out.println("Enter 5 numbers:");
        for (int i = 1; i <= 5; i++) {
            System.out.print("Input number " + i + ": ");
            int number = sc.nextInt();
            if (number > 0) {
                countPositive++;
                sumPositive=sumPositive + number;
            }
        }
        double average = 0;
        average = sumPositive / countPositive;

        System.out.println("Number of positive numbers: " + countPositive);
        System.out.printf("Average value of the said positive numbers: %.2f\n", average);
    }
}


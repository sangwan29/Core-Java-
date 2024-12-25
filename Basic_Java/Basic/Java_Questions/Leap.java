import java.util.Scanner;
public class Leap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int totalDays = sc.nextInt();
        int daysInYear = 365;
        int daysInWeek = 7;
        int years = totalDays / daysInYear;
        int remainingDays = totalDays % daysInYear;
        int weeks = remainingDays / daysInWeek;
        remainingDays = remainingDays % daysInWeek;
        System.out.println("Years: " + years);
        System.out.println("Weeks: " + weeks);
        System.out.println("Days: " + remainingDays);
    }
}

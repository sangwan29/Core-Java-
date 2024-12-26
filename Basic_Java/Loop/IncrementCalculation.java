import java.util.Scanner;

public class IncrementCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the salary:");
        double salary = sc.nextDouble();
        System.out.println("Enter the Performance appraisal rating:");
        double rating = sc.nextDouble();
        if (salary <= 0 || rating < 1 || rating > 5) {
            System.out.println("Invalid Input");
        } 
        else {
            double incrementPercentage = 0;
            if (rating >= 1 && rating <= 3) {
                incrementPercentage = 10;
            } 
            else if (rating > 3 && rating <= 4) {
                incrementPercentage = 25;
            } 
            else if (rating > 4 && rating <= 5) {
                incrementPercentage = 30;
            }
            double incrementedSalary = salary + (salary * incrementPercentage / 100);
            System.out.println(incrementedSalary);
        }
    }
}


import java.util.Scanner;
public class RangeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int number = sc.nextInt();
        if (number < 0 || number > 80) {
            System.out.println("Error: The number is either negative or greater than 80.");
        } 
        else {
            if (number >= 0 && number <= 20) {
                System.out.println("Range [0, 20]");
            } 
            else if (number >= 21 && number <= 40) {
                System.out.println("Range [21, 40]");
            } 
            else if (number >= 41 && number <= 60) {
                System.out.println("Range [41, 60]");
            } 
            else if (number >= 61 && number <= 80) {
                System.out.println("Range [61, 80]");
            }
        }
    }
}


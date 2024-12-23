import java.util.Scanner;
public class NumberTypeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input an integer: ");
        int number = sc.nextInt();
        if (number == 0) {
            System.out.println("Even");
        } 
        else if (number > 0) {
            if (number % 2 == 0) {
                System.out.println("Positive Even");
            } 
            else {
                System.out.println("Positive Odd");
            }
        } 
        else {
            if (number % 2 == 0) {
                System.out.println("Negative Even");
            } else {
                System.out.println("Negative Odd");
            }
        }
    }
}


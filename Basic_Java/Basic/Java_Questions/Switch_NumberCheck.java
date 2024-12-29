import java.util.Scanner;
public class Switch_NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int result;
        if (number > 0) {
            result = 1;
        } 
        else if (number < 0) {
            result = 2;
        } 
        else {
            result = 0;
        }
        switch (result) {
            case 1:
                System.out.println(number + " is positive.");
                break;
            case 2:
                System.out.println(number + " is negative.");
                break;
            case 0:
                System.out.println("The number is zero.");
                break;
            default:
                System.out.println("Please enter valid choice");
        }
    }
}

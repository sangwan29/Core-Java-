import java.util.Scanner;
public class Maximum_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        int result;
        if (num1 > num2) {
            result = 1;
        } 
        else if (num1 < num2) {
            result = 2;
        } 
        else {
            result = 0;
        }
        switch (result) {
            case 1:
                System.out.println("The maximum number is: " + num1);
                break;
            case 2:
                System.out.println("The maximum number is: " + num2);
                break;
            case 0:
                System.out.println("Both numbers are equal: " + num1);
                break;
            default:
                System.out.println("Enter valid choice");
        }
    }
}


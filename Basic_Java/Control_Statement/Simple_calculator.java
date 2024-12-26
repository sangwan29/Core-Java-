import java.util.*;
public class Simple_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Simple calculator:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Enter your choice(1-4)");
        int choice = scanner.nextInt();
        System.out.println("Enter first number:");
        int num1 = scanner.nextInt();
        System.out.println("Enter second number:");
        int num2 = scanner.nextInt();
        int result;
        switch (choice) {
            case 1:{
                result=num1+num2;
                System.out.print("Addition of two number is: "+result);
                break;
            }
            case 2:{
                result=num1-num2;
                System.out.print("Subtraction of two number is: "+result);
                break;
            }
            case 3:{
                result =num1*num2;
                System.out.print("Multiplication of two number is: "+result);
                break;
            }
            case 4:{
                result=num1/num2;
                System.out.print("Division of two number is: "+result);
                break;
            }
            default:{
                System.out.println("Enter the choice between 1-4");
                break;
            }
        }
    }
}

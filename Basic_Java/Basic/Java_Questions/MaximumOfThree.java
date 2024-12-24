import java.util.Scanner;
public class MaximumOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Input the second integer: ");
        int num2 = sc.nextInt();
        System.out.print("Input the third integer: ");
        int num3 = sc.nextInt();
        if(num1>num2 && num1>num3){
            System.out.println("Maximum value of three integers: "+num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.println("Maximum value of three integers: "+num2);
        }
        else{
            System.out.println("TMaximum value of three integers: "+num3);
        }
    }
}

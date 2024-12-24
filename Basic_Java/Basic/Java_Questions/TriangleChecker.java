import java.util.Scanner;
public class TriangleChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first number: ");
        double side1 = sc.nextDouble();
        System.out.print("Input the second number: ");
        double side2 = sc.nextDouble();
        System.out.print("Input the third number: ");
        double side3 = sc.nextDouble();
        if ((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
            double perimeter = side1 + side2 + side3;
            System.out.println("Perimeter = " + perimeter);
        }
        else {
            System.out.println("The values cannot form a triangle.");
        }
    }
}

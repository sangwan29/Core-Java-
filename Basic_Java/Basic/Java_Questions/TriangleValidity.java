import java.util.Scanner;
public class TriangleValidity {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first side of the triangle:");
        double side1 = sc.nextDouble();
        System.out.println("Enter the second side of the triangle:");
        double side2 = sc.nextDouble();
        System.out.println("Enter the third side of the triangle:");
        double side3 = sc.nextDouble();
        if ((side1 + side2 > side3) &&(side1 + side3 > side2) &&(side2 + side3 > side1)) {
            System.out.println("The triangle is valid.");
        } 
        else {
            System.out.println("The triangle is not valid.");
        }
    }
}


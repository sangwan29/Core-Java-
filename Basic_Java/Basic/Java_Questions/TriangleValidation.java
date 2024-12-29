import java.util.Scanner;
public class TriangleValidation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first angle of the triangle:");
        int angle1 = sc.nextInt();
        System.out.println("Enter the second angle of the triangle:");
        int angle2 = sc.nextInt();
        System.out.println("Enter the third angle of the triangle:");
        int angle3 = sc.nextInt();
        if (angle1 + angle2 + angle3 == 180){
            System.out.println("The triangle is valid.");
        } 
        else {
            System.out.println("The triangle is not valid.");
        }
    }
}

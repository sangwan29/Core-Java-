import java.util.Scanner;
public class EvenSquares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int upperLimit = sc.nextInt();
        System.out.println("List of squares of even values from 1 to " + upperLimit + ":");
        for (int i = 1; i <= upperLimit; i++) {
            if (i % 2 == 0) {
                int square = i * i;
                System.out.println(i + "^2 = " + square);
            }
        }
    }
}


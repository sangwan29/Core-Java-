import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input the first integer (p, must be even): ");
        int p = sc.nextInt();
        System.out.print("Input the second integer (q, must be positive): ");
        int q = sc.nextInt();
        System.out.print("Input the third integer (r, must be positive): ");
        int r = sc.nextInt();
        System.out.print("Input the fourth integer (s, must be positive): ");
        int s = sc.nextInt();
        if (p % 2 != 0) {
            System.out.println("Wrong values: p must be even");
        }
        if (q <= 0 || r <= 0 || s <= 0) {
            System.out.println("Wrong values: q, r, and s must be positive.");
        }
        if (q > r && s > p && (r + s) > (p + q)) {
            System.out.println("Correct values");
        } 
        else {
            System.out.println("Wrong values");
        }
    }
}


import java.util.Scanner;
public class Problem24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        while (n>0) {
            int rem = n % 10;
            sum = (sum * 10 + rem)+1;
            n = n/ 10;
        }

        System.out.println("Output is: " + sum);
    }
}


import java.util.Scanner;
public class PerfectNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = sc.nextInt();
        System.out.println("Perfect numbers between 1 and " + n + " are:");
        for (int i = 1; i <= n; i++) {
            int sum = 0;
            for (int j=1;j<= i/2;j++) {
                if (i % j == 0) {
                    sum=sum+j;
                }
            }
            if (sum == i) {
                System.out.print(i+" ");
            }
        }
    }
}

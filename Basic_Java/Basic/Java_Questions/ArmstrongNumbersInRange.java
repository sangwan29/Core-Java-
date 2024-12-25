import java.util.Scanner;
public class ArmstrongNumbersInRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = sc.nextInt();
        System.out.println("Armstrong numbers between 1 and " + n + " are:");
        for (int i = 1; i <= n; i++) {
            int count = 0;
            int temp = i;
            while (temp>0) {
                temp=temp/10;
                count++;
            }
            int sum = 0;
            temp = i;
            while (temp != 0) {
                int rem = temp % 10;  
                sum=sum+rem*rem*rem;
                temp=temp / 10; 
            }
            if (sum == i) {
                System.out.print(i+" ");
            }
        }
    }
}


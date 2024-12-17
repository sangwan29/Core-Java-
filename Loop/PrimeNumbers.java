import java.util.Scanner;
public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        if (a <= 0 || b <= 0 || a >= b) {
            System.out.println("Provide valid input");
        }
        System.out.println("Prime numbers in the range [" + a + ", " + b + "]:");
        for(int i=a;i<=b;i++){
            int count = 0;
            int j=2;
            while(j<=i/2) {
                if(i%j==0) {
                    count++;
                }
                j++;
            }
            if(count==0) {
                System.out.print(i+" ");
            }
        }
    }
}


import java.util.*;
public class While_prime2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        int i=2;
        while(i<=n) {
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
            i++;
        }
    }
}
        
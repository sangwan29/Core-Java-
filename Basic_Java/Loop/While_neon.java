import java.util.*;
public class While_neon {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int sq=n*n;
        int sum=0;
        while(sq>0) {
            int rem=sq%10;
            sum=sum+rem;
            sq=sq/10;
        }
        System.out.println("Sum of digits of square of number is:"+sum);
        if(sum==n){
            System.out.println("neon number");
        }
        else {
            System.out.println("not a neon number");
        }
    }
}

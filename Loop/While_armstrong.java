import java.util.*;
public class While_armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int temp = n;
        int sum = 0,rem;
        while(n>0){
            rem = n%10;
            sum = sum + (rem*rem*rem);
            n = n/10;
        }
        if(temp==sum){
            System.out.println("Armstrong Number");
        }
        else{
            System.out.println("Not an Armstrong Number");
        }
    }
}

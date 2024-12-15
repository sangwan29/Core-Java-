import java.util.*;
public class While_palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int temp=n;
        int sum=0,rem;
        while(n>0){
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        if(temp==sum){
            System.out.println("The number is a palindrome");
        }
        else{
            System.out.println("The number is not a palindrome");
        }
    }
}

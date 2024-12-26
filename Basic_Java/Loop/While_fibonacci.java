import java.util.*;
public class While_fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n=sc.nextInt();
        int a=0,b=1,c;
        System.out.print(a+" "+b+" ");
        int i=1;
        while(i<=n) {
            c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
            i++;
        }
    }
}

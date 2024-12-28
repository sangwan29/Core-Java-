import java.util.*;
public class While_problem7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n) {
            if(i%2==0){
                sum=sum+i;
            }
            i++;
        }
        System.out.println("Sum of first "+n+" natural numbers is: "+sum);
    }
}


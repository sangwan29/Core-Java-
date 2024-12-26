import java.util.*;
public class Problem13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting value:");
        int start=sc.nextInt();
        System.out.println("Enter ending value:");
        int end =sc.nextInt();
        int sum=0;
        int i=start;
        while(i<=end){
            sum=sum+i;
            i++;
        }
        System.out.println("The sum of numbers is: "+sum);
    }
}

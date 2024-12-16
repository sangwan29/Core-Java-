import java.util.*;
public class While_pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting value: ");
        int start=sc.nextInt();
        System.out.print("Enter ending value: ");
        int end=sc.nextInt();
        int i=start;
        while(i>=end){
            int j=1;
            while(j<=i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i--;
        }
    }
}

import java.util.*;
public class While_pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start=sc.nextInt();
        System.out.print("Enter ending value: ");
        int end=sc.nextInt();
        int i=start;
        while(i<=end){
            int j=start;
            while(j<=end){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
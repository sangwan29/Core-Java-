import java.util.*;
public class While_problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int i=n;
        while(i>=1) {
            System.out.print(i+" ");
            i--;
        }
    }
}

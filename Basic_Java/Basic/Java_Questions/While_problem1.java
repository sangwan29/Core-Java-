import java.util.*;
public class While_problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int i=1;
        while(i<=n) {
            System.out.print(i+" ");
            i++;
        }
    }
}

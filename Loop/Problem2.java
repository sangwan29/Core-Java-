import java.util.*;
public class Problem2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n:");
        int n = sc.nextInt();
        int i=100;            
        while(i>=n){
            System.out.print(i+" ");
            i--;
        }
    }
}

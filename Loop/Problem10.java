import java.util.*;
public class Problem10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting value:");
        int start = sc.nextInt();
        System.out.println("Enter ending value:");
        int end = sc.nextInt();
        int i=start;
        while(i<=end){
            System.out.print(i+" ");
            i++;
        }
    }
}

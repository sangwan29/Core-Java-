import java.util.*;
public class Problem6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter starting value");
        int start = sc.nextInt();
        System.out.println("Enter ending value");
        int end = sc.nextInt();
        int i=start;
        while(i>=end) {
            if(i%2!=0){
                System.out.print(i+" ");
            }
            i--;
        }
    }
}

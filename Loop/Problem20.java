import java.util.*;
public class Problem20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of m:");
        int m=sc.nextInt();
        System.out.println("Enter the value of n:");
        int n=sc.nextInt();
        int i=100;
        while(i>=1){
            if(i%m==0 && i%n==0){
                System.out.print(i+" ");
            }
            i--;
        }
    }
}

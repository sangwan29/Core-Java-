import java.util.*;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter starting number: ");
        int start=sc.nextInt();
        System.out.print("Enter ending number: ");
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            for(int j=start;j<=end;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

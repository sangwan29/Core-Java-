import java.util.*;
public class For_User_problem2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int start=sc.nextInt();
        System.out.print("Enter the ending number: ");
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            System.out.println("Table of "+i+":");
            for(int j=1;j<=10;j++){
                int table=i*j;
                System.out.print(table+" ");
            }
            System.out.println();
        }
    }
}

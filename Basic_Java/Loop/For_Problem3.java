import java.util.*;
public class For_Problem3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();
        int table=1;
        for(int i=1;i<=10;i++){
            table=i*n;
            System.out.println(table);
        }
    }
}

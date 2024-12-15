import java.util.*;
public class Problem15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which table you want to print:");
        int n=sc.nextInt();
        int i=1,table;
        while(i<=10){
            table=i*n;
            System.out.println(table);
            i++;
        }
    }
}

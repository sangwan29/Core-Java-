import java.util.*;
public class While_problem9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number which table you want to print: ");
        int n=sc.nextInt();
        int i=1;
        int table=1;
        System.out.println("The table of "+n+" is: ");
        while(i<=10) {
            table=n*i;
            System.out.println(n+"*"+i+"="+table);
            i++;
        }
    }
}

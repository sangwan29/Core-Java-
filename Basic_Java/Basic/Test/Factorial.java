import java.util.*;
public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int i=1;
        int fact=1;
        while(i<=n){
            fact=fact*i;
            i++;
        } 
        System.out.println("The factorial of "+n+" is "+fact);
     }
}

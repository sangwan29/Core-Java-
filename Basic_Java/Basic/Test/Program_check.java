import java.util.*;
public class Program_check {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        if(n%2==0){
            if(n>0){
                System.out.println("Positive Even");
            }
            else if(n<0){
                System.out.println("Negative Even");
            }
            else{
                System.out.println("Zero");
            }
        }
        else{
            if(n>0){
                System.out.println("Positive Odd");
            }
            else if(n<0){
                System.out.println("Negative Odd");
            }
            else{
                System.out.println("Zero");
            }

        }
    }
}

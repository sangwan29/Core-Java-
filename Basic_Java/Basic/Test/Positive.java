import java.util.*;
public class Positive{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of num:");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("Number os positive");
        }
        else if(num<0){
            System.out.println("Number is negative");
        }
        else{
            System.out.println("Number is zero");
        }
    }
}
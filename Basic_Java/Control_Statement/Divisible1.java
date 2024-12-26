import java.util.*;
public class Divisible1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        if(num%7==0 && num%3==0){
            System.out.println("number is divisible by 7 and 3");
        }
        else{
            System.out.println("number is not divisible by 7 and 3");
        }
    }
}

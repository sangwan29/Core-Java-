import java.util.*;
public class Divisible {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = sc.nextInt();
        if(n%5==0 && n%11==0){
            System.out.println("number is divisible by 5 and 11");
        }
        else if(n%5==0 || n%11==0){
            System.out.println("number is divisible by 5 or 11 by one of them");
        }
        else{
            System.out.println("number is not divisible by 5 or 11");
        }
    }
}

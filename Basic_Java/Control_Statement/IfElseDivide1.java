import java.util.*;
public class IfElseDivide1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();
        if(num%5==0 && num%11==0){
            System.out.println("The number is divisible by both 5 and 11");
        }
        else{
            System.out.println("The number is not divisible by both 5 and 11");
        }
    }
}

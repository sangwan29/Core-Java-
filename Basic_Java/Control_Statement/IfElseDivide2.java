import java.util.*;
public class IfElseDivide2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of num: ");
        int num = sc.nextInt();
        if(num%5==0 || num%11==0){
            System.out.println("The number is divisible by 5 and 11 anyone");
        }
        else{
            System.out.println("The number is not divisible by 5 and 11 anyone");
        }
    }
}

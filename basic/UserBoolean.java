import java.util.Scanner;
public class UserBoolean{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value true or false:");
        boolean a=sc.nextBoolean();
        System.out.println("You entered: "+a);
    }
}
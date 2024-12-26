import java.util.Scanner;
public class UserByte{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("You enter the value between 127 to -128:");
        byte a=sc.nextByte();
        System.out.println("You entered:"+a);
    }
}
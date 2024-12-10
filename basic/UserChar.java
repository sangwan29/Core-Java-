import java.util.Scanner;
public class UserChar{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any single character:");
        char ch = sc.next().charAt(0);
        System.out.println("You entered,the character is:"+ch);
    }
}
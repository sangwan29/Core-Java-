import java.util.Scanner;
public class UserFloat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the float value:");
        float num = sc.nextFloat();
        System.out.println("You entered:"+num);
    }
}
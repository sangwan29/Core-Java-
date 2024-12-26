import java.util.Scanner;
public class MagicBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits:");
        int digit1 = sc.nextInt();
        int digit2 = sc.nextInt();
        int digit3 = sc.nextInt();
        int digit4 = sc.nextInt();
        System.out.println(digit1 + "-" + (char) digit1);
        System.out.println(digit2 + "-" + (char) digit2);
        System.out.println(digit3 + "-" + (char) digit3);
        System.out.println(digit4 + "-" + (char) digit4);
    }
}



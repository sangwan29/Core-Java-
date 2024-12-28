import java.util.Scanner;
public class While_problem13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt(); 
        int lastDigit = number % 10;
        int firstDigit = number;
        while (firstDigit >= 10) {
            firstDigit=firstDigit / 10;
        }
        int c;
        c=firstDigit;
        firstDigit=lastDigit;
        lastDigit=c;
        System.out.println("After swapping, the firstdigit number is: "+firstDigit);
        System.out.println("After swapping, the lastdigit number is: "+lastDigit);
    }
}

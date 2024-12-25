import java.util.Scanner;
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();
        int originalNumber = number;
        for (int digit = 0; digit <= 9; digit++) {
            int count = 0;  
            int temp = number; 
            while (temp>0) {
                if (temp % 10 == digit) { 
                    count++;
                }
               temp=temp / 10;  
            }
            if (count > 0) {
                System.out.println("Digit " + digit + " appears " + count + " times.");
            }
        }
    }
}


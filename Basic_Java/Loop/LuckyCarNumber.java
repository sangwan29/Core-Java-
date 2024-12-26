import java.util.Scanner;

public class LuckyCarNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the car no: ");
        if (sc.hasNextInt()) { 
            int carNumber = sc.nextInt();
            if (carNumber >= 1000 && carNumber <= 9999) {
                int sum = 0, temp = carNumber;
                while (temp > 0) {
                    sum =sum+( temp % 10);  
                    temp =temp/ 10;   
                }
                if (sum % 3 == 0 || sum % 5 == 0 || sum % 7 == 0) {
                    System.out.println("Lucky Number");
                } else {
                    System.out.println("Sorry its not my lucky number");
                }
            } 
            else {
                System.out.println(carNumber + " is not a valid car number");
            }
        } 
        else {
            System.out.println("Entered input is not a valid car number");
        }

    }
}

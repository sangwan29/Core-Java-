import java.util.*;
public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total electricity units consumed: ");
        int units = sc.nextInt();
        double bill = 0;
        if (units <= 50) {
            bill = units * 0.50;
        } 
        else if (units <= 150) {
            bill = (50 * 0.50) + ((units - 50) * 0.75);
        } 
        else if (units <= 250) {
            bill = (50 * 0.50) + (100 * 0.75) + ((units - 150) * 1.20);
        } 
        else {
            bill = (50 * 0.50) + (100 * 0.75) + (100 * 1.20) + ((units - 250) * 1.50);
        }
        double surcharge = 0.20 * bill;
        double totalBill = bill + surcharge;
        System.out.println("Electricity Bill:");
        System.out.println("Base Bill: Rs. " + bill);
        System.out.println("Surcharge (20%): Rs. " + surcharge);
        System.out.println("Total Bill: Rs. " + totalBill);
    }
}


import java.util.Scanner;

public class TheaterDiscount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of ticket: ");
        int Tickets = sc.nextInt();
        if (Tickets < 5 || Tickets > 40) {
            System.out.println("Minimum of 5 and Maximum of 40 Tickets");
        }
        else{
            System.out.print("Do you want refreshment (y/n): ");
            char refreshment = sc.next().charAt(0);
            System.out.print("Do you have coupon code (y/n): ");
            char couponCode = sc.next().charAt(0);
            System.out.print("Enter the circle (k/q): ");
            char circle = sc.next().charAt(0);
            double ticketCost=0;
            if (circle == 'k') {
                ticketCost = 75.0;
            } 
            else if (circle == 'q') {
                ticketCost = 150.0;
            } 
            else {
                System.out.println("Invalid Input");
            }
            double totalCost = Tickets * ticketCost ;
            if (Tickets > 20) {
                totalCost =totalCost- (totalCost * 0.10);
            }
            if (couponCode == 'y') {
            totalCost = totalCost-(totalCost * 0.02);
            }
            if (refreshment == 'y') {
                totalCost = totalCost+(Tickets * 50.0);
            }
            System.out.printf("Ticket cost: %.2f\n", totalCost);
        }
    }
}


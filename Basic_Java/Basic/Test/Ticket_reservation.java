import java.util.*;
public class Ticket_reservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seat availability:");
        String seat = sc.nextLine();
        System.out.print(":Enter your age:");
        int age=sc.nextInt();
        if(seat.equals("seat available")){
            if(age>=18){
                System.out.println("Ticket booked");
            }
            else if(age>=12 && age<18){
                System.out.println("Ticket booked for children");
            }
            else{
                System.out.println("Ticket not booked");
            }
        }
        else{
            System.out.println("Ticket not booked");
        }

    }

}

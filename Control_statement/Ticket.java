import java.util.*;
public class Ticket {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter age:");
        int age=sc.nextInt();
        System.out.println("Enter ticket price");
        double price=sc.nextDouble();
        double discount=0.0;
        if(age<12){
            discount=(price*50)/100;
        }
        else if(age>=65){
            discount=(price*30)/100;
        }
        else{
            System.out.println("Actual price ticket :"+price);
        }
        price=price-discount;
        System.out.println("Ticker price after discount :"+price);
    }
}

import java.util.*;
public class Customer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string(retailer or customer):");
        String s=sc.nextLine();
        if(s.equals("retailer")){   
            System.out.println("Enter the retailer name:");
            String name=sc.nextLine();
            System.out.println("Enter the number of pieces:");
            int n=sc.nextInt();
            double discount=0.0;
            if(n<=15){
                discount=n-((n*10)/100);
            }
            else if(n>=16 && n<=30){
                discount=n-((n*10)/100);
            }
            else if(n>=31 && n<=50){
                discount=n-((n*10)/100);
            }
            else{
            System.out.println("Invalid");
            }   
            System.out.println("Retailer name:"+name);
            System.out.println("Pieces"+n);
            System.out.println("Discount:"+discount);
        }
        else if(s.equals("customer")){
            System.out.println("Enter the customer name:");
            String name=sc.nextLine();
            System.out.println("Enter the contact number:");
            int n=sc.nextInt();
            System.out.println("Enter payment:");
            int payment=sc.nextInt();
            double discount=0.0;
            if(payment>=1000 && payment<=2000){
                discount=(payment*10)/100;
            }
            else if(payment>=100 && payment<=1000){
                discount=(payment*5)/100;

            }
            else if(payment>2000 && payment<=3000){
                discount=(payment*15)/100;
            }
            else if(payment>3000){
              discount=(payment*30)/100;
            }
            double amount= payment-discount;
            System.out.println("Customer name:"+name);
            System.out.println("Contact number:"+n);
            System.out.println("Payment:"+payment);
            System.out.println("Discount:"+discount);
            System.out.println("Total payment:"+amount);
        }
    }
}
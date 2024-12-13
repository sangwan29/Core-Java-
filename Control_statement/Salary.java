import java.util.*;
public class Salary {
   public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name:");
    String name=sc.nextLine();
    System.out.println("Enter your address:");
    String address=sc.nextLine();
    System.out.println("Enter your bank details:");
    String bank_details=sc.nextLine();
    System.out.println("Enter the salary:");
    int salary=sc.nextInt();
    System.out.println("Enter the number of holidays:");
    int holidays=sc.nextInt();
    if(holidays==1){
        double alot=salary;
        System.out.println("Alot:"+alot);
        System.out.println("holidays:"+holidays);
    }
    else if(holidays>=2 && holidays<=5){
        double alot=salary-(salary*0.05);
        System.out.println("Alot:"+alot);
        System.out.println("holidays:"+holidays);
    }
    else if(holidays>5 && holidays<=14){
        double alot=salary-(salary*0.1);
        System.out.println("Alot:"+alot);
        System.out.println("holidays:"+holidays);
    
    }
    else if(holidays==15){
        double alot=salary-(salary*0.5);
        System.out.println("Alot:"+alot);
        System.out.println("holidays:"+holidays);
    }
    else{
        System.out.println("Invalid holidays");
    }
   } 
}

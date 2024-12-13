import java.util.*;
public class TaxCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the income:");
        int income=sc.nextInt();
        if(income<=10000){
            System.out.println("No tax");
        }
        else if(income>=10001 && income<=30000){
            double tax=income-((income*10)/100);
            System.out.println("Tax is "+tax);
        }
        else if(income>=30001 && income<=50000){
            double tax=income-((income*20)/100);
            System.out.println("Tax is "+tax);
        }
        else{
            double tax=income-((income*30)/100);
            System.out.println("Tax is "+tax);
        }
    }
}

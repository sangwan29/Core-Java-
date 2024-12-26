import java.util.*;
public class VoterId{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.println("Eligible for voter id");
        }
        else{
            System.out.println("Not eligible for voter id");
        }
    }
}
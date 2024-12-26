import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the five numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int sum = a + b + c + d + e;
        int average = sum / 5;
        if(average>=80){
            System.out.println("Grade is A");
        }
        else if(average>=60 && average<80){
            System.out.println("Grade is B");
        }
        else if(average>=50 && average<60){
            System.out.println("Grade is C");
        }
        else if(average>=45 && average<50){
            System.out.println("Grade is D");
        }
        else{
            System.out.println("Fail");
        }
    }
}

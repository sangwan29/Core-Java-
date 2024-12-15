import java.util.*;
public class For_User_problem3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int m=sc.nextInt();
        System.out.print("Enter the second number:");
        int n=sc.nextInt();
        for(int i=1;i<=100;i++){
            if(i%m==0 && i%n==0){
                System.out.print(i+" ");
            }
        }
    }
}

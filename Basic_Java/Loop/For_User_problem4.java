import java.util.*;
public class For_User_problem4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your choice: ");
        String choice=sc.nextLine();
        if(choice.equals("armstrong")){
            System.out.print("Enter the number: ");
            int n=sc.nextInt();
            int temp=n;
            int sum=0,rem;
            while(n>0){
                rem=n%10;
                sum=sum+(rem*rem*rem);
                n=n/10;
            }
            if(temp==sum){
                System.out.println("The number is an Armstrong number");
            }
            else{
                System.out.println("The number is not an Armstrong number");
            }
        }
        else if(choice.equals("pallindrome")){
            System.out.print("Enter the number: ");
            int n=sc.nextInt();
            int temp=n;
            int sum=0,rem;
            while(n>0){
                rem=n%10;
                sum=sum*10+rem;
                n=n/10;
            }
            if(temp==sum){
                System.out.println("The number is a Pallindrome number");
            }
            else{
                System.out.println("The number is not a Pallindrome number");
            }
        }
        else if(choice.equals("reverse")){
            System.out.print("Enter the number:");
            int n=sc.nextInt();
            int temp=n;
            int sum=0,rem;
            while(n>0){
                rem=n%10;
                sum=sum*10+rem;
                n=n/10;
            }
            System.out.println("The reverse of the number is: "+sum);
        }
        else{
            System.out.println("Invalid choice");
        }
    }
}

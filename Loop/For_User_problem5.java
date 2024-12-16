import java.util.*;
public class For_User_problem5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the choice:");
        String choice=sc.nextLine();
        if(choice.equals("factorial")){
            System.out.print("Enter the number:");
            int num=sc.nextInt();
            int fact=1;
            for(int i=1;i<=num;i++){
                fact=fact*i;
            }
            System.out.println("Factorial of "+num+" is "+fact);
        }
        else if(choice.equals("reverse")){
            System.out.print("Enter the number:");
            int num=sc.nextInt();
            int sum=0,rem;
            int temp=num;
            while(num>0){
                rem=num%10;
                sum=sum*10+rem;
                num=num/10;
            }
            System.out.println("Reverse of "+temp+" is "+sum);
        }
        else{
            System.out.println("Invalid choice");
        }
    }
}

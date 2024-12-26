import java.util.*;
public class Switch_type {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        switch(n){
            case 1:{
                System.out.println("Enter the choice 1 for even number and 2 for odd number:");
                int choice=sc.nextInt();
                if(choice==1){
                    System.out.println("Enter the number:");
                    int num=sc.nextInt();
                    if(num%2==0){
                    System.out.println("The number is even");
                    }
                }
                else if(choice==2){
                    System.out.println("Enter the number:");
                    int num=sc.nextInt();
                    if(num%2!=0){
                        System.out.println("The number is odd");
                    }                    
                }
                else{
                    System.out.println("Invalid choice");
                }
            }
            case 2:{
                System.out.println("Enter the choice (e for even number and o for odd number):");
                char choice=sc.next().charAt(0);
                if(choice=='e'){
                    System.out.println("Enter the number:");
                    int num=sc.nextInt();
                    if(num%2==0){
                        System.out.println("The number is even");
                    }
                }
                else if(choice=='o'){
                    System.out.println("Enter the number:");
                    int num=sc.nextInt();
                    if(num%2!=0){
                        System.out.println("The number is odd");
                    }
                }
                else{
                    System.out.println("Invalid choice");
                }

            }

        }
    }
}

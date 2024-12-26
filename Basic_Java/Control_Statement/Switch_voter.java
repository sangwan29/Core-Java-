import java.util.*;
public class Switch_voter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        char choice=sc.next().charAt(0);
        switch (choice) {
            case 'v':{
                System.out.println("enter your age:");
                int age=sc.nextInt();
                if(age>=18){
                    System.out.println("you are eligible for voting");
                }
                else{
                    System.out.println("you are not eligible for voting due to age");
                }
                break;

            }
            default:{
                System.out.println("you are not eligible for voting");
                break;
            }

        }
    }
}

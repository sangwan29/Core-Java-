import java.util.*;
public class For_User_problem6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your choice:  ");
        String choice=sc.nextLine();
        if(choice.equals("even")){
            System.out.println("Enter starting number: ");
            int start=sc.nextInt();
            System.out.println("Enter ending number: ");
            int end=sc.nextInt();
            for(int i=start;i<=end;i++){
                if(i%2==0){
                    System.out.print(i+" ");
                }
            }
        }
        else if(choice.equals("odd")){
            System.out.println("Enter starting number: ");
            int start=sc.nextInt();
            System.out.println("Enter ending number: ");
            int end=sc.nextInt();
            for(int i=start;i<=end;i++){
                if(i%2!=0){
                    System.out.print(i+" ");
                }
            }
        }
        else{
            System.out.println("Invalid choice");
        }
    }
}

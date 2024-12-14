import java.util.*;
public class Java_game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice(stone,paper,scissors)");
        String choice = sc.nextLine();
        if(choice.equals("stone")){
            System.out.println("You have chosen stone");
        }
        else if(choice.equals("paper")){
            System.out.println("You have chosen paper");
        }
        else if(choice.equals("scissors")){
            System.out.println("You have chosen scissors");
        }
        else{
            System.out.println("Please choose correct choice");
        }
        
    }
}

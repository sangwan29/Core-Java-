import java.util.*;
public class Resturant_menu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice(1-3)");
        int choice = sc.nextInt();
        if(choice==1){
            System.out.println("Enter the name of the dish");
            String name = sc.next();
            System.out.println("Enter the price of the dish");
            int price = sc.nextInt();
            System.out.println("Enter the number of the dish");
            int quantity = sc.nextInt();
            System.out.println("The name of the dish is "+name+" and the price is "+price+" the number of dishes is:"+quantity);
        }
        else if(choice==2){
            System.out.println("Enter the name of the dish");
            String name = sc.next();
            System.out.println("Enter the price of the dish");
            int price = sc.nextInt();
            System.out.println("Enter the number of the dish");
            int quantity = sc.nextInt();
            System.out.println("The name of the dish is "+name+" and the price is "+price+" the number of dishes is:"+quantity);
        }
        else if(choice==3){
            System.out.println("Enter the name of the dish");
            String name = sc.next();
            System.out.println("Enter the price of the dish");
            int price = sc.nextInt();
            System.out.println("Enter the number of the dish");
            int quantity = sc.nextInt();
            System.out.println("The name of the dish is "+name+" and the price is "+price+" the number of dishes is:"+quantity);
        }
        else{
            System.out.println("Invalid choice");
        }
    }
}

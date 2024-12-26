import java.util.*;
public class MaxFive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        int a = sc.nextInt();
        System.out.println("Enter second number:");
        int b = sc.nextInt();
        System.out.println("Enter third number:");
        int c = sc.nextInt();
        System.out.println("Enter fourth number:");
        int d = sc.nextInt();
        System.out.println("Enter fifth number:");
        int e = sc.nextInt();
        if(a>b && a>c && a>d && a>e){
            System.out.println("a is maximum than other number");
        }
        else if(b>a && b>c && b>d && b>e){
            System.out.println("b is maximum than other number");
        }
        else if(c>a && c>b && c>d && c>e){
            System.out.println("c is maximum than other number");
        }
        else if(d>a && d>b && d>c && d>e){
            System.out.println("d is maximum than other number");
        }
        else{
            System.out.println("e is maximum than other number");
        }
    }
}

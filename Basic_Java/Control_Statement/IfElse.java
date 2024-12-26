import java.util.*;
public class IfElse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        //using if else for find maximum number
        if(a>b){
            if(a>c){
                System.out.println("Maximum number is "+a);
            }
            else{
                System.out.println("Maximum number is "+c);
            }
        }
        else{
            if(b>c){
                System.out.println("Maximum number is "+b);
            }
            else{
                System.out.println("Maximum number is "+c);
            }
        }
    }
}
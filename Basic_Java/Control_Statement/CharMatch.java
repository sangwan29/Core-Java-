import java.util.*;
public class CharMatch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character:");
        char ch=sc.next().charAt(0);
        if(ch=='a'){
            System.out.println("Apple");
        }
        else if(ch=='b'){
            System.out.println("Ball");
        }
        else if(ch=='c'){
            System.out.println("Cat");
        }
        else{
            System.out.println("not match");
        }
    }
}

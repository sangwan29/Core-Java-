import java.util.*;
public class Upper {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a single character:");
       char ch=sc.next().charAt(0);
       if(ch>='A' && ch<='Z'){
        System.out.println("uppercase");
       }
       else{
        System.out.println("lowercase");
       }
    }
}

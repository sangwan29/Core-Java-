import java.util.*;
public class Problem21 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("constant for print table without user element");
        System.out.println("user for print table with user element");
        System.out.println("Enter the coice:");
        String choice=sc.nextLine();
        if(choice.equals("constant")){
            int i=1,n=2;
            while(i<=10){
                System.out.println(n+"*"+i+"="+n*i);
                i++;
            }
        }
        else if(choice.equals("user")){
            System.out.println("Enter the number:");
            int n=sc.nextInt();
            int i=1;
            while(i<=10){
                System.out.println(n+"*"+i+"="+n*i);
                i++;
            }
        }
        else{
            System.out.println("Invalid choice");
        }
    }
}

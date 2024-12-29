import java.util.*;
public class Switch_EvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a single charcter(e for even, o for odd)");
        char ch=sc.next().charAt(0);
        System.out.print("Enter a number: ");
        int n=sc.nextInt();
        switch(ch) {
            case 'e':
                if(n%2==0){
                    System.out.println(n+" is even");
                }
                else{
                    System.out.println(n+" is odd");
                }
                break;
            case 'o':
                if(n%2!=0){
                    System.out.println(n+" is odd");
                }
                else{
                    System.out.println(n+" is even");
                }
                break;
            default:
                System.out.println("Please enter either e or o");
                break;
        }
    }
}

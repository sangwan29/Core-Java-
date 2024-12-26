import java.util.Scanner;
public class Problem25{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int place = 1;
        while (n>0) {
            int rem = n % 10;    
            rem= (rem +1) % 10;     
            sum = sum+(rem * place); 
            place =place* 10;          
            n=n/10;              
        }
        System.out.println("Output is: " + sum);
    }
}


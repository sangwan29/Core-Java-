import java.util.*;
public class While_prime1 {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number");
    int n=sc.nextInt();
    int count=0;
    int i=2;
    while(i<=n/2){
        if(n%i==0){
            count++;
        }
        i++;
    }
    if(count==0){
        System.out.println(n+" is prime number");
    }
    else{
        System.out.println(n+" is not prime number");
    }

   } 
}

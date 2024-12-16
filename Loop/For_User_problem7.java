import java.util.*;
public class For_User_problem7 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter neon : For find neon number");
        System.out.println("Enter perfect : For find perfect number");
        System.out.println("Enter prime : For find prime number");
        System.out.println("Enter count : For find count of number");
        System.out.println("Enter sum : For find sum of digits");
        System.out.println("Enter fibonacci : For find fibonacci series");
        System.out.println("Enter choice: ");
        String choice = sc.next();
        if(choice.equals("neon")){
            System.out.println("Enter number :");
            int n = sc.nextInt();
            int sq=n*n;
            int sum=0;
            while(sq>0) {
                int rem=sq%10;
                sum=sum+rem;
                sq=sq/10;
            }
            if(sum==n){
                System.out.println("neon number");
            }
            else {
                System.out.println("not a neon number");
            }
        }
        else if(choice.equals("perfect")){
            System.out.println("Enter number :");
            int n = sc.nextInt();
            int sum=0;
            int i=1;
            while(i<=n/2){
                if(n%i==0){
                    sum=sum+i;
                }
                i++;
            }
            if(sum==n){
                System.out.println(n+" is a perfect number");
            }
            else{
                System.out.println(n+" is not a perfect number");
            }
        }
        else if(choice.equals("prime")){
            System.out.print("Enter the value of n:");
            int n=sc.nextInt();
            int i=2;
            while(i<=n) {
                int count = 0;
                int j=2;
                while(j<=i/2) {
                    if(i%j==0) {
                        count++;
                    }
                    j++;
                }
                if(count==0) {
                    System.out.print(i+" ");
                }
                i++;
            }
        }
        else if(choice.equals("count")){
            System.out.print("Enter the number:");
            int n=sc.nextInt();
            int count=0;
            while(n>0){
                count++;
                n=n/10;
            }
            System.out.println(count);
        }
        else if(choice.equals("sum")){
            //sum of digits
            System.out.print("Enter the number:");
            int n=sc.nextInt();
            int sum=0;
            while(n>0){
                sum=sum+(n%10);
                n=n/10;
            }
            System.out.println("Sum of digits: "+sum);
        }
        else if(choice.equals("fibonacci")){
            System.out.print("Enter a number: ");
            int n=sc.nextInt();
            int a=0,b=1,c;
            System.out.print(a+" "+b+" ");
            int i=1;
            while(i<=n) {
                c=a+b;
                a=b;
                b=c;
                System.out.print(c+" ");
                i++;
            }
        }
        else{
            System.out.println("Invalid choice");
        }
    }
}

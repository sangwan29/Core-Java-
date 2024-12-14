import java.util.*;
public class Switch_problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("a:armstrong number");
        System.out.println("p:prime number");
        System.out.println("e:even number");
        System.out.println("o:odd number");
        System.out.println("f:factorial number");
        System.out.println("r:reverse number");
        System.out.println("l:fibonacci");
        System.out.println("t:perfect number");
        System.out.println("n:neon number");
        System.out.println("w:leap year");
        System.out.println("s:swap one way");
        System.out.println("v:vowel and consonant");
        System.out.println("Enter your choice");
        char ch=sc.next().charAt(0);
        switch (ch) {
            case 'a':{
                System.out.println("Enter the number");
                int n=sc.nextInt();
                int sum=0;
                int temp=n;
                while(n>0){
                    int rem=n%10;
                    sum=sum+(rem*rem*rem);
                    n=n/10;
                }
                if(temp==sum){
                    System.out.println(temp+" is armstrong number");
                }
                else{
                    System.out.println(temp+" is not armstrong number");
                }
                break;
            }
            case 'p':{
                System.out.println("Enter the number");
                int n=sc.nextInt();
                int count=0;
                for(int i=2;i<=n/2;i++){
                    if(n%i==0){
                        count++;
                    }
                }
                if(count==0){
                    System.out.println(n+" is prime number");
                    }
                else{
                    System.out.println(n+" is not prime number");
                }
                break;
            }
            case 'e':{
                System.out.println("Enter the number");
                int n=sc.nextInt();
                if(n%2==0){
                    System.out.println(n+" is even number");
                }
                else{
                    System.out.println(n+" is not an even number");
                }
                break;
            }
            case 'o':{
                System.out.println("Enter the number");
                int n=sc.nextInt();
                if(n%2!=0){
                    System.out.println(n+" is odd number");
                }
                else{
                    System.out.println(n+" is not odd number");
                }
                break;
            }
            case 'f':{
                System.out.println("Enter the number");
                int n=sc.nextInt();
                int fact=1;
                for(int i=1;i<=n;i++){
                    fact=fact*i;
                }
                System.out.println(n+" factorial is "+fact);
                break;
            }
            case 'r':{
                System.out.println("Enter the number");
                int n=sc.nextInt();
                int sum=0;
                int temp=n;
                //reverse number:
                while(n>0){
                    int rem=n%10;
                    sum=sum*10+rem;
                    n=n/10;
                }
                if(temp==sum){
                    System.out.println(temp+" is a reverse number");
                }
                else{
                    System.out.println(temp+" is not a reverse number");
                }
                break;
            }
            case 'l':{
                //fibonacci
                int n1=0,n2=1,n3;
                System.out.println("Enter the number: ");
                int n=sc.nextInt();
                System.out.print(n1+" "+n2+" ");
                for(int i=1;i<=n;i++){
                    n3=n1+n2;
                    n1=n2;
                    n2=n3;
                    System.out.print(n3+" ");
                }
                break;
            }
            case 't':{
                //perfect number:
                System.out.println("Enter the number");
                int n=sc.nextInt();
                int sum=0;
                for(int i=1;i<n;i++){
                    if(n%i==0){
                        sum=sum+i;
                    }
                }
                if(sum==n){
                    System.out.println(n+" is a perfect number");
                }
                else{
                    System.out.println(n+" is not a perfect number");
                }
                break;
            }
            case 'n':{
                //neon number:
                System.out.println("Enter the number");
                int n=sc.nextInt();
                int sum=0;
                int sq=n*n;
                while(sq!=0){
                    int rem=sq%10;
                    sum=sum+rem;
                    sq=sq/10;
                }
                if(sum==n){
                    System.out.println(n+" is a neon number");
                }
                else{
                    System.out.println(n+" is not a neon number");
                }
                break;
            }
            case 'w':{
                //leap year
                System.out.println("Enter the year");
                int year=sc.nextInt();
                if(year%4==0 && year%100!=0 || year%400==0){
                    System.out.println(year+" is a leap year");
                }
                else{
                    System.out.println(year+" is not a leap year");
                }
                break;
            }
            case 's':{
                //swap a number
                System.out.println("Enter the number");
                int a=sc.nextInt();
                System.out.println("Enter the second number:");
                int b=sc.nextInt();
                int c;
                c=a;
                a=b;
                b=c;
                System.out.println("First number after swapping is "+a);
                System.out.println("Second number after swapping is "+b);
                break;
            }
            case 'v':{
                //vowel or consonant
                System.out.println("Enter the character");
                char alpha=sc.next().charAt(0);
                if(alpha=='a' || alpha=='e' || alpha=='i' || alpha=='o' || alpha=='u'){
                    System.out.println(ch+" is a vowel");
                }
                else{
                    System.out.println(ch+" is a consonant");
                }
                break;
            }
            default:{
                System.out.println("Invalid choice");
            }
        }
    }
}

import java.util.*;
public class While_Problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter even for even number");
        System.out.println("Enter odd for odd number");
        System.out.println("Enter the choice:");
        String choice= sc.nextLine();
        if(choice.equals("even")){
            System.out.println("Enter type 1 for print 1 to 100 even number");
            System.out.println("Enter type 2 for print sum of even number from 1 to 100");
            System.out.println("Enter type 3 for print random value for even number");
            System.out.println("Enter type 4 for print sum of random value ");
            System.out.println("Enter the choice:");
            int ch=sc.nextInt();
            if(ch==1){
                int i=1;
                while(i<=100){
                    if(i%2==0){
                        System.out.print(i+" ");
                    }
                    i++;
                }
            }
            else if(ch==2){
                int i=1,sum=0;
                while(i<=100){
                    if(i%2==0){
                        sum=sum+i;
                    }
                    i++;
                }
                System.out.println("The sum of all even numbers is: "+sum);
            }
            else if(ch==3){
                System.out.print("Enter starting value: ");
                int start=sc.nextInt();
                System.out.print("Enter ending value: ");
                int end=sc.nextInt();
                int i=start;
                while(i<=end){
                    if(i%2==0){
                        System.out.print(i+" ");
                    }
                    i++;
                }
            }
            else if(ch==4){
                System.out.print("Enter starting value: ");
                int start=sc.nextInt();
                System.out.print("Enter ending value: ");
                int end=sc.nextInt();
                int i=start;
                int sum=0;
                while(i<=end){
                    sum=sum+i;
                    i++;
                }
                System.out.println("The sum of numbers is: "+sum);
            }
        }
        else if(choice.equals("odd")){
            System.out.println("Enter type 1 for print 1 to 100 odd number");
            System.out.println("Enter type 2 for print sum of odd number from 1 to 100");
            System.out.println("Enter type 3 for print random value for odd number");
            System.out.println("Enter type 4 for print sum of random value ");
            System.out.println("Enter the choice:");
            int ch=sc.nextInt();
            if(ch==1){
                int i=1;
                while(i<=100){
                    if(i%2!=0){
                        System.out.print(i+" ");
                    }
                    i++;
                }
            }
            else if(ch==2){
                int i=1,sum=0;
                while(i<=100){
                    if(i%2!=0){
                        sum=sum+i;
                    }
                    i++;
                }
                System.out.println("The sum of all odd numbers is: "+sum);
            }
            else if(ch==3){
                System.out.print("Enter starting value: ");
                int start=sc.nextInt();
                System.out.print("Enter ending value: ");
                int end=sc.nextInt();
                int i=start;
                while(i<=end){
                    if(i%2!=0){
                        System.out.print(i+" ");
                    }
                    i++;
                }
            }
            else if(ch==4){
                System.out.print("Enter starting value: ");
                int start=sc.nextInt();
                System.out.print("Enter ending value: ");
                int end=sc.nextInt();
                int i=start;
                int sum=0;
                while(i<=end){
                    sum=sum+i;
                    i++;
                }
                System.out.println("The sum of numbers is: "+sum);
            }
        }

    }
}

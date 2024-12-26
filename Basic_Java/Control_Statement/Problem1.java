import java.util.*;
public class Problem1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the input area or volume:");
        String input=sc.next();
        if(input.equals("area")){
            System.out.println("Enter the input triangle,square and rectangle:");
            String check=sc.next();
            if(check.equals("triangle")){
                System.out.println("Enter the base of triangle:");
                double base=sc.nextDouble();
                System.out.println("Enter the height of triangle:");
                double height=sc.nextDouble();
                double area=(base*height)/2;
                System.out.println("The area of triangle is: "+area);
            }
            else if(check.equals("square")){
                System.out.println("Enter the side of a square:");
                int side=sc.nextInt();
                int area=side*side;
                System.out.println("The area of a square is: "+area);
            }
            else if(check.equals("rectangle")){
                System.out.println("Enter the length of rectangle:");
                int length=sc.nextInt();
                System.out.println("Enter the breadth of rectangle:");
                int breadth=sc.nextInt();
                int rectangle=length*breadth;
                System.out.println("The area of rectangle is:"+rectangle);
            }
        }
        else if(input.equals("Volume")){
            System.out.println("not match");
        }
        else{
            System.out.println("Enter a valid string");
        }

    }
}

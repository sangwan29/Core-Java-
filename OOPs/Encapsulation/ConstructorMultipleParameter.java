import java.util.*;
class Rectangle{
    int length;
    int breadth;
    Rectangle(int length,int breadth){
        this.length = length;
        this.breadth=breadth;
        System.out.println("The length is: "+length+" and the breadth is: "+breadth);
    }
}
public class ConstructorMultipleParameter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        int length=sc.nextInt();
        System.out.print("Enter the breadth of the rectangle: ");
        int breadth=sc.nextInt();
        new Rectangle(length, breadth);
    }
}

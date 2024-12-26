import java.util.*;
class Circle{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    void display(){
        System.out.println("The radius of the circle is: "+radius);
    }
}
public class ConstructorWithInstance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the radius of the circle:");
        double radius=sc.nextDouble();
        Circle c = new Circle(radius);
        c.display();
    }
}

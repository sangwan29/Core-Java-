import java.util.*;
class Car{
    String model;
    int year;
    Car(String model){
        this.model=model;
        year=2024;
    }
}
public class ConstructorParameterDefault {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter car model:");
        String model=sc.nextLine();
        Car c=new Car(model);
        System.out.print("The model of car is: "+model+" and the year of car is: "+c.year);
    }
}

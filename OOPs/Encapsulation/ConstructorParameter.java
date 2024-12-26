import java.util.*;
class Car{
    Car(String model,int year){
        System.out.println("The model is: "+model);
        System.out.println("The year is: "+year);
    }
}
public class ConstructorParameter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the model of the car:");
        String model=sc.nextLine();
        System.out.println("Enter the year of the car:");
        int year=sc.nextInt();
        new Car(model, year);
    }
}

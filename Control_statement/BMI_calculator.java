import java.util.*;
public class BMI_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your weight in kg: ");
        double weight = scanner.nextDouble();
        System.out.println("Enter your height in meters: ");
        double height = scanner.nextDouble();
        double bmi = weight / (height * height);
        if(bmi<18.5){
            System.out.println("You are underweight");
        }
        else if(bmi>=18.5 && bmi<=24.9){
            System.out.println("You are normal weight");
        }
        else if(bmi>=25 && bmi<=29.9){
            System.out.println("You are overweight");
        }
        else{
            System.out.println("You are obesity");
        }
    }
}

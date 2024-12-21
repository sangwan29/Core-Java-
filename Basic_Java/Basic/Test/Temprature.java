import java.util.*;
public class Temprature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String type = sc.next();
        if(type.equals("celsius")){
            System.out.println("Enter the temperature");
            double far=sc.nextDouble();
            double cel;
            cel = (far-32.0)*(5.0/9.0);
            System.out.println("The temperature in celsius is: "+cel);
        }
        else if(type.equals("Farenheit")){
            System.out.println("Enter the temperature:");
            double cel=sc.nextDouble();
            double far;
            far=((9.0/5.0)*cel)+32.0;
            System.out.println("The temperature in farenheit is: "+far);
        }
        else{
            System.out.println("Please enter right value");
        }
    }
}
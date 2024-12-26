import java.util.Scanner;
public class Fuel {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of liters to fill the tank: ");
        float liters = sc.nextFloat();
        System.out.print("Enter the distance covered: ");
        float distance = sc.nextFloat();
        if (liters <= 0) {
            System.out.println(liters+" is an Invalid Input");
        }
        else if(distance<=0){
            System.out.println(distance+" is an Invalid Input");
        }
        else {
            float litersPer100Km = (liters / distance) * 100;
            float miles = distance * 0.6214f;
            float gallons = liters * 0.2642f;
            float milesPerGallon = miles / gallons;
            System.out.printf("Liters/100KM\n%.2f\n", litersPer100Km);
            System.out.printf("Miles/gallons\n%.2f\n", milesPerGallon);
        }
    }
}

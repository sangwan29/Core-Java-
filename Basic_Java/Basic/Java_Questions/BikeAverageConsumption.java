import java.util.Scanner;
public class BikeAverageConsumption {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input total distance in km: ");
        int distance = sc.nextInt();
        System.out.print("Input total fuel spent in liters: ");
        float fuel = sc.nextFloat();
        float averageConsumption = distance / fuel;
        System.out.printf("Average consumption (km/lit): %.3f\n", averageConsumption);
    }
}


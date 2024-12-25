import java.util.Scanner;
public class AverageValueCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the weight of Item 1: ");
        float weightItem1 = sc.nextFloat();
        System.out.print("Enter the number of Item 1: ");
        float numberItem1 = sc.nextFloat();
        System.out.print("Enter the weight of Item 2: ");
        float weightItem2 = sc.nextFloat();
        System.out.print("Enter the number of Item 2: ");
        float numberItem2 = sc.nextFloat();
        float totalWeight = (weightItem1 * numberItem1) + (weightItem2 * numberItem2);
        float totalItems = numberItem1 + numberItem2;
        float averageValue = totalWeight / totalItems;
        System.out.println("Average Value = " + averageValue);
    }
}


import java.util.Scanner;
public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Cost Price (CP):");
        double costPrice = sc.nextDouble();
        System.out.println("Enter the Selling Price (SP):");
        double sellingPrice = sc.nextDouble();
        if (sellingPrice > costPrice) {
            double profit = sellingPrice - costPrice;
            System.out.println("You made a profit of: " + profit);
        } 
        else if (sellingPrice < costPrice) {
            double loss = costPrice - sellingPrice;
            System.out.println("You incurred a loss of: " + loss);
        } 
        else {
            System.out.println("No profit, no loss. The cost price and selling price are the same.");
        }
    }
}


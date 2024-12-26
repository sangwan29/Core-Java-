import java.util.*;
class Book{
    private double price;
    void setPrice(double price) {
        this.price = price;
    }
    double getPrice() {
        return price;
    }
}
public class GetterAndSetterBasic2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the price of the book: ");
        double price=sc.nextDouble();
        Book b=new Book();
        b.setPrice(price);
        System.out.println(b.getPrice());
    }
}

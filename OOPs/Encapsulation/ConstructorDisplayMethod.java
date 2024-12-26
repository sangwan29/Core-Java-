import java.util.*;
class Book{
    String title;
    String author;
    int price;
    Book(String title, String author, int price) {
        this.title=title;
        this.author=author;
        this.price=price;
    }
    void displaydetails(){
        System.out.println("Title is: "+title);
        System.out.println("Author is: "+author);
        System.out.println("Price is: "+price);
    }
}
public class ConstructorDisplayMethod {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the title of the book: ");
        String title=sc.nextLine();
        System.out.print("Enter the author of the book: ");
        String author=sc.nextLine();
        System.out.print("Enter the price of the book: ");
        int price=sc.nextInt();
        Book b=new Book(title,author,price);
        b.displaydetails();
    }
}

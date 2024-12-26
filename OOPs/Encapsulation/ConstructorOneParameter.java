import java.util.*;
class Book{
    String title;
    Book(String title){
        this.title = title;
        System.out.println("The title of the book is: " + title);
    }
}
public class ConstructorOneParameter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the title of the book: ");
        String title = scanner.nextLine();
        new Book(title);
    }
}

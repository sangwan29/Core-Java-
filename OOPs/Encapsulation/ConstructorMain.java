import java.util.*;
class Book{
    String title;
    String author;
    Book(String title,String author){
        this.title=title;
        this.author=author;
    }

}
public class ConstructorMain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the title of the book: ");
        String title=sc.nextLine();
        System.out.print("Enter the author of the book: ");
        String author=sc.nextLine();
        new Book(title, author);
        System.out.println("The title is: "+title+" and the author is: "+author);
    }
}

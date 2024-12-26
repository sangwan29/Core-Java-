import java.util.*;
class Book{
    String title;
    Book(String title){
        this.title = title;
        System.out.println("The title is: "+title);
    }
}
public class ConstructorStringParameter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the title of the book:");
        String title=sc.nextLine();
        new Book(title);
    }
}

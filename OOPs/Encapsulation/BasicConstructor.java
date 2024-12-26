class Book{
    String title;
    String author;
    Book(){
        title = "Bharat ki khoj";
        author = "Pandit JawaharLal Nehru";
        System.out.println("The title is: "+title+" and the author is: "+author);
    }
}
public class BasicConstructor{
    public static void main(String[] args) {
        new Book();
    }
}
import java.util.*;
class Animal{
    String name;
    String species;
    Animal(String name, String species) {
        System.out.println("The name is: "+name);
        System.out.println("The species is: "+species);
    }
}
public class ContructorString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the name of the animal: ");
        String name=sc.nextLine();
        System.out.print("Enter the species of the animal: ");
        String species=sc.nextLine();
        new Animal(name,species);
    }
}

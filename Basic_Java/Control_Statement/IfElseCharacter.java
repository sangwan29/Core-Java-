import java.util.*;
public class IfElseCharacter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter any single character: ");
        char ch=sc.next().charAt(0);
        if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
            System.out.println("The character is a vowel");
        }
        else{
            System.out.println("The character is a consonant");
        }
    }
}

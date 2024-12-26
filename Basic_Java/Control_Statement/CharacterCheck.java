import java.util.Scanner;
public class CharacterCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char input = sc.next().charAt(0);
        if ((input >= 'a' && input <= 'z') || (input >= 'A' && input <= 'Z')) {
            System.out.println(input + " is an alphabet.");
        }
        else if (input >= '0' && input <= '9') {
            System.out.println(input + " is a digit.");
        }
        else {
            System.out.println(input + " is neither an alphabet nor a digit.");
        }
    }
}


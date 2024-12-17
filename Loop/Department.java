import java.util.Scanner;

public class Department {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no of students placed in CSE: ");
        int cse = sc.nextInt();
        System.out.print("Enter the no of students placed in ECE: ");
        int ece = sc.nextInt();
        System.out.print("Enter the no of students placed in MECH: ");
        int mech = sc.nextInt();
        if (cse < 0 || ece < 0 || mech < 0) {
            System.out.println("Input is Invalid");
            return;
        }
        if (cse == ece && ece == mech) {
            System.out.println("None of the department has got the highest placement");
        } else {
            System.out.println("Highest placement");
            if (cse > ece && cse > mech) {
                System.out.println("CSE");
            } 
            else if (ece > cse && ece > mech) {
                System.out.println("ECE");
            } 
            else if (mech > cse && mech > ece) {
                System.out.println("MECH");
            } 
            else {
                if (cse == ece) {
                    System.out.println("CSE");
                    System.out.println("ECE");
                }
                if (cse == mech) {
                    System.out.println("CSE");
                    System.out.println("MECH");
                }
                if (ece == mech) {
                    System.out.println("ECE");
                    System.out.println("MECH");
                }
            }
        }
    }
}


import java.util.*;
public class Student_Data {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Roll number of the student:");
        int roll = sc.nextInt();
        System.out.println("Enter the Name of the student:");
        String name = sc.next();
        System.out.println("Enter the student father's name:");
        String father_name = sc.next();
        System.out.println("Enter the student mother's name:");
        String mother_name = sc.next();
        System.out.println("Enter the address of the student:");
        String address = sc.next();
        System.out.println("Enter the student contact number(max 10 digits):");
        String contact = sc.next();
        System.out.println("Roll number of the student is: "+roll);
        System.out.println("Name of the student is: "+name);
        System.out.println("Father's name of the student is: "+father_name);
        System.out.println("Mother's name of the student is: "+mother_name);
        System.out.println("Address of the student is: "+address);
        System.out.println("Enter the contact number of the student:"+contact);
        System.out.println("Enter the marks of Physics,chemistry and computer application:");
        int physics = sc.nextInt();
        int chemistry = sc.nextInt();
        int computer_application = sc.nextInt();
        int total=physics+chemistry+computer_application;
        double per=(total/3);
        System.out.println("Total marks of the student is: "+total);
        System.out.println("total percentage of the student is: "+per);
        if(per>=60){
            System.out.println("First Division");
        }
        else if(per<60 && per>=33){
            System.out.println("Second Division");
        }
        else{
            System.out.println("Fail");
        }

    }
}


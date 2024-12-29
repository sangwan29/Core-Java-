import java.util.*;
public class Student_Data {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of subjects: ");
        int physics = sc.nextInt();
        int chemistry= sc.nextInt();
        int biology= sc.nextInt();
        int mathematics= sc.nextInt();
        int computer= sc.nextInt();
        int total =physics+chemistry+biology+mathematics+computer;
        System.out.println("Total marks: "+total);
        double per=total/5;
        System.out.println("Percentage: "+per+"%");
        if(per>=90){
            System.out.println("Grade: A");
        }
        else if(per>=80){
            System.out.println("Grade: B");
        }
        else if(per>=70){
            System.out.println("Grade: C");
        }
        else if(per>=60){
            System.out.println("Grade: D");
        }
        else if(per>=40){
            System.out.println("Grade: E");
        }
        else{
            System.out.println("Grade: F");
        }
    }
}

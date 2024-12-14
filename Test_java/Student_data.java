import java.util.*;
public class Student_data{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of five subject:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        int e = sc.nextInt();
        int total=a+b+c+d+e;
        double per=total/5;
        System.out.println("Percentage: "+per);
        if(per>=80){
            System.out.println("Grade: A");
        }
        else if(per>=60 && per<80){
            System.out.println("Grade: B");
        }
        else if(per>=50 && per<60){
            System.out.println("Grade: C");
        }
        else if(per>=45 && per<50){
            System.out.println("Grade: D");
        }
        else if(per>=25 && per<45){
            System.out.println("Grade: E");
        }
        else{
            System.out.println("Grade: F");
        }
    }
}
    

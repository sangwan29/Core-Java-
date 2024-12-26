import java.util.*;
public class Height {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your height in cm: ");
        int height = sc.nextInt();
        height = height/100;
        if(height>2){
            System.out.println("High");
        }
        else if(height==2){
            System.out.println("Mid");
        }
        else{
            System.out.println("Low");
        }

    }
}

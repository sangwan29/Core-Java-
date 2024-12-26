import java.util.*;
public class Switch_gender {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter gender:");
        char g=sc.next().charAt(0);
        switch(g){
            case 'm':{
                System.out.println("Male");
                break;
            }
            case 'f':{
                System.out.println("Female");
                break;
            }
            default:{
                System.out.println("Invalid gender");
                break;
            }
        }
    }
}

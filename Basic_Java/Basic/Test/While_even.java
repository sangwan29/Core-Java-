import java.util.*;
public class While_even {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=21;
        while(num<30){
            if(num%2==0){
                System.out.println("Number is even: "+num);
            }
            num++;
        }
    }
}

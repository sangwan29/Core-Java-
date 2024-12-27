import java.util.*;
class A{
    void show(int a,int b){
        int c=a+b;
        System.out.println("The addition is: "+c);
    }
    void show(int a,int b){
        int c=a-b;
        System.out.println("The subtraction is: "+c);
    }
    void show(int a,int b){
        int c=a*b;
        System.out.println("The multiplication is: "+c);
    }
    void show(int a,int b){
        int c=a/b;
        System.out.println("The division is: "+c);
    }
    void show(int a,int b){
        int c=a%b;
        System.out.println("The modulus is: "+c);
    }
}
public class MethodOverloadingBasic1{
    public static void main(String[] args) {
        A p=new A();
        p.show(45, 78);
    }
}
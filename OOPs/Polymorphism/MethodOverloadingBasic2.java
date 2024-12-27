import java.util.*;
class A{
    void show(int a,int b,int c,int d){
        int p=a+b+c+d;
        System.out.println("The addition is: "+p);
    }
    void show(int a,int b,int c){
        int p=a-b-c;
        System.out.println("The subtraction is: "+p);
    }
    void show(int a,int b,int c,int d,int e){
        int p=a*b*c*d*e;
        System.out.println("The multiplication is: "+p);
    }
    void show(int a){
        int p=a/2;
        System.out.println("The division is: "+p);
    }
    void show(int a,int b){
        int p=a%b;
        System.out.println("The modulus is: "+p);
    }
}
public class MethodOverloadingBasic2{
    public static void main(String[] args) {
        A p=new A();
        p.show(21,12,35,48);
        p.show(89, 12, 32);
        p.show(2,5,12,4,3);
        p.show(98);
        p.show(78,3);
    }
}
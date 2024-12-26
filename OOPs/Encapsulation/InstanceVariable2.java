import java.util.*;
class A{
    int a,b;
    void add(int x,int y){
        a=x;
        b=y;
        System.out.println(a+b);
    }
    void sub(int x,int y){
        a=x;
        b=y;
        System.out.println(a-b);
    }
    void multi(int x,int y){
        a=x;
        b=y;
        System.out.println(a*b);
    }
    void div(int x,int y){
        a=x;
        b=y;
        System.out.println(a/b);
    }
}
public class InstanceVariable2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the value of x and y: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        A p=new A();
        p.add(x,y);
        p.sub(x,y);
        p.multi(x,y);
        p.div(x,y);
    }
}

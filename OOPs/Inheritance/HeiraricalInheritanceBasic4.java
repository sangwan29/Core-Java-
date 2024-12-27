class A{
    int a=45;
    int b=85;
    int c=65;
    int d=98;
}
class B extends A{
    void show(){
        System.out.println("The first instance variable of class A: "+a);
        System.out.println("The second instance variable of class B: "+b);
    }
}
class C extends A{
    void show1(){
        System.out.println("The third instance variable of class A: "+c);
        System.out.println("The fourth instance variable of class A: "+d);
    }
}
class D extends A{
    void show2(){
        System.out.println("The instance variable from class A: "+b);
    }
}
public class HeiraricalInheritanceBasic4 {
    public static void main(String[] args) {
        B b=new B();
        b.show();
        C c=new C();
        c.show1();
        D d=new D();
        d.show2();
    }
}

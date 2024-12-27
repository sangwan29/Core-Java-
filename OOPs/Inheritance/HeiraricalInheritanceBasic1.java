class A{
    void method1(){
        System.out.println("This is class A method 1");
    }
}
class B extends A{
    int method2(){
        int a=54;
        System.out.println("The value of a is:(method2): "+a);
        return a;
    }
}
class C extends A{
    int method3(int a){
        System.out.println("The value of a is(method 3): "+a);
        return a;
    }
}
class D extends A{
    void method4(int a){
        System.out.println("The value of a is(method 4): "+a);
    }
}
class E extends A{
    A method5(){
        System.out.println("Welcome in India");
        return this;
    }
}
public class HeiraricalInheritanceBasic1 {
    public static void main(String[] args) {
        B b=new B();
        b.method1();
        b.method2();
        C c=new C();
        c.method1();
        c.method3(78);
        D d=new D();
        d.method1();
        d.method4(84);
        E e=new E();
        e.method1();
        e.method5();
    }
}

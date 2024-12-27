class A{
    void Method1(){
        System.out.println("Method 1");
    }
}
class B extends A{
    void method2(){
        System.out.println("Method 2");
    }
}
class C{
    void method3(){
        A k=new A();
        k.Method1();
    }
    int method5(int n){
        System.out.println("Method 5");
        return n;
    }
}
class D{
    void method4(){
        B b=new B();
        b.method2();
    }
}
public class SingleLevelInheritanceMethod {
    public static void main(String[] args) {
        C c=new C();
        c.method3();
        System.out.println(c.method5(85));
        D d=new D();
        d.method4();
    }
}

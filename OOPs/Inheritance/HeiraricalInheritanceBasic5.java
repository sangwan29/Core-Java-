class A{
    void method1(){
        System.out.println("This is method 1");
    }
    void method2(){
        method1();
        System.out.println("This is method 2");
    }
    void method3(){
        method2();
        System.out.println("This is method 3");
    }
}
class B extends A{
    void method4(){
        method3();
        System.out.println("This is method 4");
    }
    void method5(){
        method4();
        System.out.println("This is method 5");
    }
    void method6(){
        method5();
        System.out.println("This is method 6");
    }
}
class C extends A{
    void method7(){
        System.out.println("This is method 7");
    }
    void method8(){
        method7();
        System.out.println("This is method 8");
    }
}
class D extends A{
    void method9(){
        method3();
    }
}
public class HeiraricalInheritanceBasic5 {
    public static void main(String[] args) {
        B b=new B();
        b.method6();
        C c=new C();
        c.method8();
        D d=new D();
        d.method9();
    }
}

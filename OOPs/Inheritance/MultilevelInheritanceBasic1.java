class A{
    void method1(){
        System.out.println("Here this is method 1");
    }
}
class B extends A{
    void method2(){
        System.out.println("Here this is method 2");
    }
}
class C extends B{
    void method3(){
        System.out.println("Here this is method 3");
    }
}
class D extends C{
    void method4(){
        System.out.println("Here this is method 4");
    }
}
public class MultilevelInheritanceBasic1 {
    public static void main(String[] args) {
        D p=new D();
        p.method1();
        p.method2();
        p.method3();
        p.method4();
    }
}

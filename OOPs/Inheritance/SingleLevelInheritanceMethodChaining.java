class A{
    void method1(){
        System.out.println("Here, this is method 1");
    }
    void method2(){
        method1();
        System.out.println("Here, This is method 2");
    }
}
class B extends A{
    void method3(){
        method2();
        System.out.println("Here, This is method 3");
    }
    void method4(){
        method3();
        System.out.println("Here, This is method 4");
    }
    void method5(){
        method4();
        A a=new A();
        System.out.println("Here this is method 5 for calling class A");
    }
}
public class SingleLevelInheritanceMethodChaining {
    public static void main(String[] args) {
        B b=new B();
        b.method5();
    }
}

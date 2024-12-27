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
    void method4(){
        method3();
        System.out.println("This is method 4");
    }
    void method5(){
        method4();
        System.out.println("This is method 5");
    }
}
public class MethodChaining {
    public static void main(String[] args) {
        A k=new A();
        k.method5();
    }
}

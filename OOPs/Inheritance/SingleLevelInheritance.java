class A{
    void method1(){
        System.out.println("Method 1");
    }
    void method2(String name){
        System.out.println("Hello, " + name);
    }
}
class B extends A{
    String method3(){
        return "Method 3";
    }
    int method4(int n){
        return n;
    }
}
public class SingleLevelInheritance{
    public static void main(String[] args) {
        B b=new B();
        b.method1();
        b.method2("Surname");
        System.out.println(b.method3());
        System.out.println(b.method4(10));

    }
}

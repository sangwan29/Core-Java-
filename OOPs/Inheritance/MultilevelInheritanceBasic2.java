class A{
    A method1(int a){
        System.out.println("The value of a is(method 1): "+a);
        return this;
    }
}
class B extends A{
    String method2(){
        String name="Welcome in India";
        System.out.println("Method 2: "+name);
        return name;
    }
}
class C extends B{
    void method3(){
        System.out.println("This is no return and no argument method 3");
    }
}
class D extends C{
    void method4(int a){
        System.out.println("The value of a is(in method 4) :"+a);
    }
}
public class MultilevelInheritanceBasic2 {
    public static void main(String[] args) {
        D p=new D();
        p.method1(48);
        p.method2();
        p.method3();
        p.method4(58);
    }
}

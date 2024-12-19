class A{
    String show1(String name){
        return name;
    }
}
class B{
    B show2(String name){
        System.out.println(name);
        return this;
    }
}
public class Method12 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.show1("Hello, World!"));
        B b = new B();
        b.show2("Welcome to India");
    }
}

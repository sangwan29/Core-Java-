class A{
    String show(){
        String name="Hello world";
        return name;
    }
}
class B{
    B show1(){
        System.out.println("Welcome to India");
        return this;
    }
}
public class Method8 {
    public static void main(String[] args) {
        A p=new A();
        System.out.println(p.show());
        B s=new B();
        s.show1();
    }
}

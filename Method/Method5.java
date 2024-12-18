class A{
    void show(int a){
        System.out.println(a);
    }
}
class B{
    void show2(String name){
        System.out.println(name);
    }
}
class C{
    void show3(char a){
        System.out.println(a);
    }
    void show4(char b){
        System.out.println(b);
    }
    void show5(char c){
        System.out.println(c);
    }
}
class D{
    void show6(int a){
        System.out.println(a);
    }
    void show7(int b){
        System.out.println(b);
    }
    void show8(int c){
        System.out.println(c);
    }
    void show9(int d){
        System.out.println(d);
    }
}
public class Method5 {
    public static void main(String[] args) {
        A a=new A();
        a.show(4);
        B b=new B();
        b.show2("Hello World");
        C c=new C();
        c.show3('a');
        c.show4('b');
        c.show5('c');
        D d=new D();
        d.show6(5);
        d.show7(8);
        d.show8(18);
        d.show9(89);
    }
}

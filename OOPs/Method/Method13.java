class A{
    int show1(int a){
        System.out.println(a);
        return a;
    }
}
class B{
    String show2(String name){
        System.out.println(name);
        return name;
    }
}
class C{
    String show3(String n){
        System.out.println(n);
        return n;
    }
    String show4(String d){
        System.out.println(d);
        return d;
    }
    String show5(String e){
        System.out.println(e);
        return e;
    }
}
class D{
    int show6(int a){
        System.out.println(a);
        return a;
    }
    int show7(int b){
        System.out.println(b);
        return b;
    }
    char show8(char c){
        System.out.println(c);
        return c;
    }
    String show9(String f){
        System.out.println(f);
        return f;
    }
}
public class Method13 {
    public static void main(String[] args) {
        A p =new A();
        p.show1(45);
        B b =new B();
        b.show2("Hello");
        C c =new C();
        c.show3("Hii");
        c.show4("Hello");
        c.show5("How are you");
        D d =new D();
        d.show6(45);
        d.show7(85);
        d.show8('h');
        d.show9("India");
    }
}

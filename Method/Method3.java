class A{
    void show(){
        System.out.println("Hello World");
    }
}
class B{
    void show1(){
        System.out.println("Hii,how are you?");
    }
}
class C{
    void show2(){
        System.out.println("I am good,thank you");
    }
    void show3(){
        System.out.println("Welcome");
    }
    void show4(){
        System.out.println("Good bye");
    }
}
class D{
    void show5(){
        System.out.println("I am here");
    }
    void show6(){
        System.out.println("I am there");
    }
    void show7(){
        System.out.println("I am somewhere");
    }
    void show8(){
        System.out.println("I am nowhere");
    }
}
public class Method3 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        a.show();
        b.show1();
        c.show2();
        c.show3();
        c.show4();
        d.show5();
        d.show6();
        d.show7();
        d.show8();
    }
}

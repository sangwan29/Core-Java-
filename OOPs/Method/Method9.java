class A{
    int show(){
        int a=4;
        return a;
    }
}
class B{
    char show1(){
        char c='b';
        return c;
    }
}
class C{
    String show2(){
        String name="hii";
        return name;
    }
    String show3(){
        String a="Hello";
        return a;
    }
    String show4(){
        String b="How are you?";
        return b;
    }
}
class D{
    int show5(){
        int a=56;
        return a;
    }
    int show6(){
        int b=58;
        return b;
    }
    int show7(){
        int c=87;
        return c;
    }
    int show8(){
        int d=95;
        return d;
    }
}
public class Method9 {
    public static void main(String[] args) {
        A s=new A();
        System.out.println(s.show());    
        B p=new B();
        System.out.println(p.show1());   
        C d=new C();
        System.out.println(d.show2());
        System.out.println(d.show3());
        System.out.println(d.show4());
        D f=new D();
        System.out.println(f.show5());
        System.out.println(f.show6());
        System.out.println(f.show7());
        System.out.println(f.show8());
    }
}

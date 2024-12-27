class A{
    private int a;
    void setA(int a){
        this.a=a;
    }
    int getA(){
        return a;
    }
}
class B extends A{
    private int b;
    void setB(int b){
        this.b=b;
    }
    int getB(){
        return b;
    }
}
class C extends A{
    private int c;
    void setC(int c){
        this.c=c;
    }
    int getC(){
        return c;
    }
}
class D extends A{
    private int d;
    void setD(int d){
        this.d=d;
    }
    int getD(){
        return d;
    }
}
public class HeiraricalInheritanceBasic3 {
    public static void main(String[] args) {
        B b=new B();
        b.setA(87);
        b.setB(96);
        C c=new C();
        c.setA(52);
        c.setC(12);
        D d=new D();
        d.setA(62);
        d.setD(230);
        System.out.println("The value of class A access through class B: "+b.getA());
        System.out.println("The value of class B: "+b.getB());
        System.out.println("The value of class A access through class C: "+c.getA());
        System.out.println("The value of class C: "+c.getC());
        System.out.println("The value of class A access through class D: "+d.getA());
        System.out.println("The value of class D: "+d.getD());
    }
}

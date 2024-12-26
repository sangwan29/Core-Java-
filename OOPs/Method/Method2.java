class A{
    void show1() {
        System.out.println("Hello World");
    }
    void show2(){
        System.out.println("Hii,How are you?");
    }
}
public class Method2{
    public static void main(String[] args) {
        A p=new A();
        p.show1();
        p.show2();
    }
}
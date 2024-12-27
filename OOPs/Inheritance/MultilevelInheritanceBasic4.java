class A{
    A(){
        System.out.println("This is class A default constructor");
    }
}
class B extends A{
    B(){
        System.out.println("This is class B default constructor");
    }
}
class C extends B{
    C(){
        System.out.println("This is class C default constructor");
    }
}
public class MultilevelInheritanceBasic4 {
    public static void main(String[] args) {
        new C();
    }
}

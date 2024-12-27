class A{
    public int a=85;
}
class B extends A{
    void show(){
        System.out.println("The value of instance variable is: "+a);
    }
}
public class SingleLevelInheritanceBasic3 {
    public static void main(String[] args) {
        B p=new B();
        p.show();
    }
}

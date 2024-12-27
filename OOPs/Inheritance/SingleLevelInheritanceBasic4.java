class A{
    protected int a=79;
}
class B extends A{
    void show(){
        System.out.println("The value of instance variable is: "+a);
    }
}
public class SingleLevelInheritanceBasic4 {
    public static void main(String[] args) {
        B b=new B();
        b.show();
    }
}

class A{
    int a=89;
    int b=90;
    void add(){
        int c=a+b;
        System.out.println("Sum of a and b is "+c);
    }
}
public class InstanceVariable {
    public static void main(String[] args) {
        A p=new A();
        p.add();
    }
}

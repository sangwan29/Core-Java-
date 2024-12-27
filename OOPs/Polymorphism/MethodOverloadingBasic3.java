class A{
    void show(int a,int b){
        System.out.println("The addition is: "+(a+b));
    }
    void show(byte a,byte b){
        System.out.println("The substraction is: "+(a-b));
    }
    void show(short a,short b){
        System.out.println("The multiplication is: "+(a*b));
    }
    void show(float a,float b){
        System.out.println("The division is: "+(a/b));
    }
    void show(double a,double b){
        System.out.println("The modulus is: "+(a%b));
    }
}
public class MethodOverloadingBasic3 {
    public static void main(String[] args) {
        A p=new A();
        p.show(10,20);
        p.show((byte)10,(byte)20);
        p.show((short)10,(short)20);
        p.show(10.5f,20.5f);
        p.show(10.5,20.5);
    }
}

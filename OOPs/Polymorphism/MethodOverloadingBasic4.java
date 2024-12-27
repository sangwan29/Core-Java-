class A{
    void show(int a){
        System.out.println("The int primitive datatype value is: "+a);
    }
    void show(String a){
        System.out.println("The String datatype value is: "+a);
    }
    void show(double a){
        System.out.println("The double datatype value is: "+a);
    }
    void show(float a){
        System.out.println("The float datatype value is: "+a);
    }
    void show(long a){
        System.out.println("The long datatype value is: "+a);
    }
    void show(byte a){
        System.out.println("The byte datatype value is: "+a);
    }
    void show(short a){
        System.out.println("The short datatype value is: "+a);
    }
    void show(char a){
        System.out.println("The char datatype value is: "+a);
    }
}
public class MethodOverloadingBasic4 {
    public static void main(String[] args) {
        A p=new A();
        p.show(10);
        p.show("Hello");
        p.show(10.5);
        p.show(10.5f);
        p.show(10L);
        p.show((byte)10);
        p.show((short)10);
        p.show('A');
    }
}

class A{
    int show1(int a){
        return a;
    }
    byte show2(int b){
        return (byte) b;
    }
    short show3(int c){
        return (short)c;
    }
    long short4(int d){
        return (long)d;
    }
    float show5(float e){
        return e;
    }
    double show6(double f){
        return f;
    }
    char show7(char g){
        return g;
    }
    boolean show8(boolean h){
        return h;
    }
}
public class Method11 {
    public static void main(String[] args) {
        A s=new A();
        System.out.println(s.show1(4));
        System.out.println(s.show2(127));
        System.out.println(s.show3(854));
        System.out.println(s.short4(1234567890));
        System.out.println(s.show5(45.32f));
        System.out.println(s.show6(45.3));
        System.out.println(s.show7('j'));
        System.out.println(s.show8(true));
    }
}

class A{
    char show(){
        char a='a';
        return a;
    }
    boolean show1(){
        boolean a=true;
        return a;
    }
    byte show2(){
        byte a=127;
        return a;
    }
    short show3(){
        short a=857;
        return a;
    }
    int show4(){
        int a=35877;
        return a;
    }
    long show5(){
        long a=2589634;
        return a;
    }
    float show6(){
        float a=2.35f;
        return a;
    }
    double show7(){
        double a=24.5;
        return a;
    }
}
public class Method7 {
    public static void main(String[] args) {
        A s=new A();
        System.out.println(s.show());
        System.out.println(s.show1());
        System.out.println(s.show2());
        System.out.println(s.show3());
        System.out.println(s.show4());
        System.out.println(s.show5());
        System.out.println(s.show6());
        System.out.println(s.show7());
    }
}

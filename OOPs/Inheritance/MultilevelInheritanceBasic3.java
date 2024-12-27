class A{
    private String name;
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return name;
    }
}
class B extends A{
    private String hello;
    void setHello(String hello){
        this.hello=hello;
    }
    String getHello(){
        return hello;
    }
}
class C extends B{
    private String alpha;
    void setAlpha(String alpha){
        this.alpha=alpha;
    }
    String getAlpha(){
        return alpha;
    }
}
public class MultilevelInheritanceBasic3 {
    public static void main(String[] args) {
        C p=new C();
        p.setName("Hello");
        p.setHello("how are you");
        p.setAlpha("Welcome to india");
        System.out.println("This is class A: "+p.getName());
        System.out.println("This is class B: "+p.getHello());
        System.out.println("This is class C: "+p.getAlpha());
    }
}

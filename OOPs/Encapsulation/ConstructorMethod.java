class A{
    A(){   
    }
    void show(){
        System.out.println("Welcome to India");
    }
    int add(int a, int b){
        int c=a+b;
        System.out.println("The value of c is: "+c);
        return c;
    }
    int sub(){
        int a=45,b=12;
        int c=a-b;
        System.out.println("The value of c is: "+c);
        return c;
    }
}
public class ConstructorMethod {
    public static void main(String[] args) {
        System.out.println("First way of call:");
        new A().show();
        new A().add(45,5);
        new A().sub();  
        System.out.println("Another way of call:");
        A obj=new A();
        obj.show();
        obj.add(45,12);
        obj.sub();
    }
}

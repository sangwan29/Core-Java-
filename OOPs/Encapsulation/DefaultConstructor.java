class Person{
    String name="Unknown";
    int age=0;
    Person(){
        System.out.println("The name is: "+name+" and the age is: "+age);
    }
}
public class DefaultConstructor {
    public static void main(String[] args) {
        new Person();
    }
}

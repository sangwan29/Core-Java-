class Person{
    String name;
    int age;
    Person(){
         name="John";
         age=25;
    }
}
public class ConstructorInitilisation {
    public static void main(String[] args) {
        Person person=new Person();
        System.out.println("The name is: "+person.name);
        System.out.println("The age is:"+person.age);
    }
}

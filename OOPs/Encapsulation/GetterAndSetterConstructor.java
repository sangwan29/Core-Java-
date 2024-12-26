class Student {
    private int id;
    private String name;
    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    void setA(int id,String Name) {
        this.id = id;
        this.name=name;
    }
    int getId() {
        return id;
    }
    String getName() {
        return name;
    }
}
public class GetterAndSetterConstructor{    
    public static void main(String[] args) {
        Student s=new Student(1,"Divya Sangwan");
        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
        s.setA(2,"Shivam");  
        System.out.println("ID: " + s.getId());
        System.out.println("Name: " + s.getName());
    }
}


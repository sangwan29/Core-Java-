class Student{
    private String name;
    private int rollNumber;
    private String grade;
    void setName(String name,int rollNumber,String grade){
        this.name=name;
        this.rollNumber=rollNumber;
        this.grade=grade;
    }
    String getName(){
        return name;
    }
    int getrollNumber(){
        return rollNumber;
    }
    String getGrade(){
        return grade;
    }
}
public class Main {
    public static void main(String[] args) {
        Student sc=new Student();
        sc.setName("Rahul", 12, "A");
        System.out.println("The name is: "+sc.getName());
        System.out.println("The rollNumber is: "+sc.getrollNumber());
        System.out.println("The grade is: "+sc.getGrade());
    }
}

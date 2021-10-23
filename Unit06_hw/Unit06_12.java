//rename Student.java
public class Student {
    int age,grade;
    String name,id;
    public Student(){
        age = 20;
        grade = 1;
        name = "NoName";
        id = "ACS001";
    }
    public Student(int age){
        this.age = age;
        grade = 1;
        name = "NoName";
        id = "ACS001";
    }
    public Student(String name){
        this.name = name;
        age = 20;
        grade = 1;
        id = "ACS001";
    }
    public Student(int age,int grade,String name,String id){
        this(age);
        //this(grade);
        this.grade = grade;
        this.name = name;
        this.id = id;
    }
}

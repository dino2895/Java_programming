//rename Student.java
import java.util.Scanner;

public class Student{
    private int age;
    private int grade;
    private String name;

    public Student(){
        age = 20;
        grade = 1;
        name = "NoName";
    }
    public Student(int AGE,int GRADE,String NAME){
        age = AGE;
        grade = GRADE;
        name = NAME;
    }

    public int getGrade(){
        return grade;
    }
    public boolean setGrade(int GRADE){
        grade = GRADE;
        if(GRADE!=0)
            return true;
        return false;
    }
    public int getAge(){
        return age;
    }
    public boolean setAge(int AGE){
        age = AGE;
        if(AGE!=0)
            return true;
        return false;
    }
    public String getName(){
        return name;
    }
    public boolean setName(String NAME){
        name = NAME;
        if(name!=null)
            return true;
        return false;
    }
    public boolean setStudent(){
        age = 20;
        grade = 1;
        name = "NoName";
        return true;
    }
    public boolean setStudent(int GRADE){
        grade = GRADE;
        age = 20;
        name = "NoName";
        if(GRADE!=0)
            return true;
        return false;
    }
    public boolean setStudent(int AGE,int GRADE,String NAME){
        age = AGE;
        grade = GRADE;
        name = NAME;
        if(grade!=0&&age!=0&&name!=null)
            return true;
        return false;
    }
}

//需要改檔案名稱為 Student 再上傳
import java.util.Scanner;

public class Student {
    private int grade;
    private String name;
    
    public Student(){
        grade = 1;
        name = "NoName";
    }
    public Student(int GRADE,String NAME){
        grade = GRADE;
        name = NAME;
    }
    public int getGrade(){
        return grade;
    }
    public boolean setGrade(int GRADE){
        grade = GRADE;
        if(grade!=0)
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
    public static void main(String[] args)  {
		Scanner sc = new Scanner(System.in);
		Student student1=new Student();
		Student student2=new Student();
		System.out.println("student1 use getGrade and setGrade, student2 use getName and setName");
		student1.setGrade(sc.nextInt());
		student2.setName(sc.next());

		System.out.println("Student1:"+"grade="+student1.getGrade()+" name="+student1.getName());
		System.out.println("Student2:"+"grade="+student2.getGrade()+" name="+student2.getName());
	}

}

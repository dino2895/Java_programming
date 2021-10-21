//需要改檔案名稱&class 為 Student 再上傳
public class Unit06_01 {
    int age=0,grade=0;
    String name=null,id=null;

    public boolean setAge(int AGE){
        age = AGE;
        if(age!=0)
            return true;
        return false;
    }
    public boolean setId(String ID){
        id = ID;
        if(id!=null)
            return true;
        return false;
    }
    public boolean setStudent(int GRADE,String NAME,String ID){
        grade = GRADE;
        name = NAME;
        id = ID;
        if(age!=0&&name!=null&&id!=null)
            return true;
        return false;
    }
    

    public static void main(String[] args) {
        
    }
}

//rename Car.java
public class Car {
    int speed,mileage;
    String color,brand;
    
    public boolean setSpeed(int SPEED){
        speed = SPEED;
        if(speed!=0)
            return true;
        return false;
    }
    public boolean setMileage(int MILEAGE){
        mileage = MILEAGE;
        if(mileage!=0)
            return true;
        return false;
    }
    public boolean setColor(String COLOR){
        color = COLOR;
        if(color!=null)
            return true;
        return false;
    }
    public boolean setBrand(String BRAND){
        brand = BRAND;
        if(brand!=null)
            return true;
        return false;
    }
    public boolean setCar(String COLOR,String BRAND){
        color = COLOR;
        brand = BRAND;
        if(color!=null&&brand!=null)
            return true;
        return false;
    }
    public boolean setCar(int SPEED,int MILEAGE,String COLOR,String BRAND){
        speed = SPEED;
        mileage = MILEAGE;
        color = COLOR;
        brand = BRAND;
        if(color!=null&&brand!=null&&speed!=0&&mileage!=0)
            return true;
        return false;
    }
}
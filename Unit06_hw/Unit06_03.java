//rename Car.java
public class Car {
    int speed,mileage;
    String color,brand;
    
    public Car(){
        speed=0;
        mileage=0;
        color="NoColor";
        brand="NoBrand";
    }
    public Car(int SPEED,int MILEAGE,String COLOR,String BRAND){
        speed = SPEED;
        mileage = MILEAGE;
        color = COLOR;
        brand = BRAND;
    }

    public int getSpeed(){
        return speed;
    }
    public int getMileage(){
        return mileage;
    }
    public String getColor(){
        return color;
    }
    public String getBrand(){
        return brand;
    }

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
}
//rename Car.java
//第二筆String 要用brand 題目沒寫ZZZZZZZZ 拉X
public class Car {
    int speed,mileage;
    String color,brand;
    public Car(){
        speed = 0;
        mileage = 0;
        color = "NoColor";
        brand = "NoBrand";
    }
    public Car(int speed){
        this.speed = speed;
        mileage = 0;
        color = "NoColor";
        brand = "NoBrand";
    }
    public Car(String brand){
        speed = 0;
        mileage = 0;
        color = "NoColor";
        this.brand = brand;
    }
    public Car(String color,String brand){
        speed = 0;
        mileage = 0;
        this.color = color;
        this.brand = brand;
    }
    public Car(int speed,int mileage,String color,String brand){
        this.speed = speed;
        this.mileage = mileage;
        this.color = color;
        this.brand = brand;
    }
}

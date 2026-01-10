package session8_ex2;

public class Car extends Vehicle{
    public Car(String name, int speed) {
        super(name, speed);
    }
    @Override
    public void dispalyInfo(){
        System.out.println("Car name:"+getName()+",Speed:"+getSpeed()+"km/h");
    }
}

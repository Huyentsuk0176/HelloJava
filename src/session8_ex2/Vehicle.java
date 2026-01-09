package session8_ex2;

public abstract class Vehicle {
    private String name;
    private int speed;
    public Vehicle(String name, int speed){
        this.name = name;
        this.speed = speed;
    }
    public abstract void displayInfo();
    public void start(){
        System.out.println("Vehicle is staring..");
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }
}

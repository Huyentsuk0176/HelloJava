package session8_ex2;

public class Main {
    public static void main(String[] args) {
        Vehicle car=new Car("Toyota",120);
        Vehicle Bike=new Bike("Yamaha",80);
        car.start();
        car.displayInfo();
        Bike.start();
        Bike.displayInfo();

    }
}

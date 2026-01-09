package session8_ex2;

public class Bike extends Vehicle{
    public Bike(String name, int speed) {
        super(name, speed);
    }
        @Override
                public void dispalyInfo(){
            System.out.println("Bike name:"+getName()+",Speed:"+getSpeed()+"km/h");
        }
    }


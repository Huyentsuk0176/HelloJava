package session8_ex1;

public class Cat extends Animals{
    private String furColor;
    public Cat(String name, int age, String furColor) {
        super(name, age);
        this.furColor = furColor;
    }
        @Override
                public String makeSound(){
            return"Meow Meow";
        }
        @Override
                public void displayInfo(){
            super.displayInfo();
            System.out.println("Mau long:"+furColor);
        }
    }


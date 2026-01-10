package session8_ex1;

public class Animals {
    private String name;
    private int age;
    public Animal(String name, int age){
        if (name==null||  name.isEmpty()){
            throw new IllegalAccessException("Ten khong duoc de trong");
        }
        if (age<0){
            throw new IllegalAccessException("Tuoi khong duoc am");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void displayInfo(){
        System.out.println("Ten: " + name+",Tuoi:" +age);
    }
    public String makeSound(){
        return"some generic sound";
    }
}

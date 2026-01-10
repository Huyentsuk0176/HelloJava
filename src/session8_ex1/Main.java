package session8_ex1;
import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) {
        Animals[] animalsArray=new Animals[2];
        Dog dog1=new Dog("Buddy",3,"Golden Retriever");
        Cat cat1=new Cat("Whiskers",2,"Ghi");
        animalsArray[0]=dog1;
        animalsArray[1]=cat1;
        for (Animals animal:animalsArray){
            animal.displayInfo();
            System.out.println("Am thanh:"+animal.makeSound());
            System.out.println();
        }
    }
}

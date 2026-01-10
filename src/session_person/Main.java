package session_person;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Person p1= new Person();
        System.out.print("Nhap tuoi nguoi thu nhat: ");
        p1.setAge(sc.nextInt());
        sc.nextLine();
        Person p2 = new Person();
        System.out.print("Nhap tuoi nguoi thu hai: ");
        p2.setAge(sc.nextInt());
        System.out.println("Ket qua so sanh");
        if (p1.getAge()> p2.getAge()) {
            System.out.println(p1.getName()+"Lon tuoi hon"+ p2.getName());
        } else if (p1.getAge()< p2.getAge()) {
            System.out.println(p2.getName()+"Lon tuoi hon" + p1.getName());
        } else {
            System.out.println("Hai nguoi bang tuoi nhau");
        }

    }
}

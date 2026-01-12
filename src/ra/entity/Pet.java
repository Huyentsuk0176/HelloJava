package ra.entity;

import java.util.Scanner;

public abstract class Pet {
    // ========== ATTRIBUTES ==========
    protected String petId;   // C001 / D001
    protected String petName; // 20-50 ký tự
    protected int age;        // > 0

    // ========== CONSTRUCTOR ==========
    public Pet() {
    }

    public Pet(String petId, String petName, int age) {
        this.petId = petId;
        this.petName = petName;
        this.age = age;
    }

    // ========== GETTER & SETTER ==========
    public String getPetId() {
        return petId;
    }

    public void setPetId(String petId) {
        this.petId = petId;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // ========== INPUT ==========
    public void inputData(Scanner scanner) {
        System.out.print("Nhập mã thú cưng (Cxxx / Dxxx): ");
        this.petId = scanner.nextLine();

        System.out.print("Nhập tên thú cưng (20-50 ký tự): ");
        this.petName = scanner.nextLine();

        System.out.print("Nhập tuổi (>0): ");
        this.age = Integer.parseInt(scanner.nextLine());
    }

    // ========== DISPLAY ==========
    public void displayData() {
        System.out.printf("Mã: %s | Tên: %s | Tuổi: %d | ",
                petId, petName, age);
    }

    // ========== ABSTRACT ==========
    public abstract void speak();
}

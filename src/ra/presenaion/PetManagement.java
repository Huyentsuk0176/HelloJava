package ra.presentation;

import ra.entity.Cat;
import ra.entity.Dog;
import ra.entity.Pet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PetManagement {
    static List<Pet> petList = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("*********************QUẢN LÝ THÚ CƯNG********************");
            System.out.println("1. Hiển thị danh sách thú cưng");
            System.out.println("2. Thêm thú cưng");
            System.out.println("3. Gọi tiếng kêu");
            System.out.println("4. Xóa thú cưng");
            System.out.println("5. Tìm thú cưng theo tên");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    displayPets();
                    break;
                case 2:
                    addPet(scanner);
                    break;
                case 3:
                    petSpeak(scanner);
                    break;
                case 4:
                    deletePet(scanner);
                    break;
                case 5:
                    searchByName(scanner);
                    break;
                case 6:
                    System.out.println("Thoát chương trình!");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        } while (choice != 6);
    }

    // ========== FUNCTIONS ==========
    static void displayPets() {
        if (petList.isEmpty()) {
            System.out.println("Danh sách trống!");
            return;
        }
        for (Pet pet : petList) {
            pet.displayData();
            pet.speak();
        }
    }

    static void addPet(Scanner scanner) {
        System.out.print("Chọn loại thú cưng (1-Dog | 2-Cat): ");
        int type = Integer.parseInt(scanner.nextLine());

        Pet pet;
        if (type == 1) {
            pet = new Dog();
        } else {
            pet = new Cat();
        }

        pet.inputData(scanner);
        petList.add(pet);
        System.out.println("Thêm thành công!");
    }

    static void petSpeak(Scanner scanner) {
        System.out.print("Nhập mã thú cưng: ");
        String id = scanner.nextLine();

        for (Pet pet : petList) {
            if (pet.getPetId().equalsIgnoreCase(id)) {
                pet.speak();
                return;
            }
        }
        System.out.println("Không tìm thấy thú cưng!");
    }

    static void deletePet(Scanner scanner) {
        System.out.print("Nhập mã thú cưng cần xóa: ");
        String id = scanner.nextLine();

        for (Pet pet : petList) {
            if (pet.getPetId().equalsIgnoreCase(id)) {
                petList.remove(pet);
                System.out.println("Xóa thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy thú cưng!");
    }

    static void searchByName(Scanner scanner) {
        System.out.print("Nhập tên thú cưng cần tìm: ");
        String name = scanner.nextLine();

        boolean found = false;
        for (Pet pet : petList) {
            if (pet.getPetName().toLowerCase().contains(name.toLowerCase())) {
                pet.displayData();
                pet.speak();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Không tìm thấy thú cưng!");
        }
    }
}

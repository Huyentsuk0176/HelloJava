package ra.presentation;

import ra.entity.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {

    // Danh sách sinh viên
    static ArrayList<Student> studentList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {
            System.out.println("*********************QUẢN LÝ SINH VIÊN********************");
            System.out.println("1. Hiển thị danh sách sinh viên");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Cập nhật thông tin sinh viên theo mã");
            System.out.println("4. Xóa sinh viên theo mã");
            System.out.println("5. Tìm sinh viên theo tên");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    showStudents();
                    break;
                case 2:
                    addStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    searchStudentByName();
                    break;
                case 6:
                    System.out.println("Thoát chương trình!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    // ===== 1. Hiển thị =====
    public static void showStudents() {
        if (studentList.isEmpty()) {
            System.out.println("Danh sách sinh viên trống!");
            return;
        }
        for (Student student : studentList) {
            student.displayData();
        }
    }

    // ===== 2. Thêm =====
    public static void addStudent() {
        Student student = new Student();
        student.inputData(scanner);
        studentList.add(student);
        System.out.println("Thêm sinh viên thành công!");
    }

    // ===== 3. Cập nhật =====
    public static void updateStudent() {
        System.out.print("Nhập mã sinh viên cần cập nhật: ");
        String id = scanner.nextLine();

        for (Student student : studentList) {
            if (student.getStudentId().equals(id)) {
                System.out.println("Nhập thông tin mới:");
                student.inputData(scanner);
                System.out.println("Cập nhật thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên!");
    }

    // ===== 4. Xóa =====
    public static void deleteStudent() {
        System.out.print("Nhập mã sinh viên cần xóa: ");
        String id = scanner.nextLine();

        for (Student student : studentList) {
            if (student.getStudentId().equals(id)) {
                studentList.remove(student);
                System.out.println("Xóa sinh viên thành công!");
                return;
            }
        }
        System.out.println("Không tìm thấy sinh viên!");
    }

    // ===== 5. Tìm theo tên =====
    public static void searchStudentByName() {
        System.out.print("Nhập tên sinh viên cần tìm: ");
        String name = scanner.nextLine();

        boolean found = false;
        for (Student student : studentList) {
            if (student.getStudentName().toLowerCase().contains(name.toLowerCase())) {
                student.displayData();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Không tìm thấy sinh viên!");
        }
    }
}









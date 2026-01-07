import java.util.ArrayList;
import java.util.Scanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("An", 20, "CNTT1", 7.5));
        students.add(new Student("Anh", 22, "CNTT2", 8.5));
        students.add(new Student("Tran", 30, "CNTT3", 9.5));
        students.add(new Student("Tam", 29, "CNTT4", 6.5));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap diem Min: " );
        double min =
                scanner.nextDouble();
        System.out.println("Nhap diem Max: " );
        double max =
                scanner.nextDouble();
        System.out.println("Sinh vien co diem tu " + min + "den" + max + ":" );
        for (Student s : students) {
            if (s.avgScore >= min && s.avgScore <= max) {
                s.display();


            }
        }
    }
}



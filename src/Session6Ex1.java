import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import  java.util.Scanner;
public class Session6Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList
                <Double> danhSachDiem = new ArrayList<>();
        int choice;
        do {
            System.out.println("Quan ly diem sinh vien");
            System.out.println("1. Nhap danh sach diem sinh vien");
            System.out.println("2.In danh sach diem");
            System.out.println("3. Tinh diem trung binh cua cac sinh vien");
            System.out.println("4. Tim diem cao nhat va thap nhat");
            System.out.println("5. Dem so luong sinh vien dat va truot");
            System.out.println("6.Sap xep diem tang dan");
            System.out.println("7. Thong ke so luong sinh vien gioi va xuat sac");
            System.out.println("8. thoat");
            System.out.println("Chon chuc nang");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Nhap so luong sinh vien: ");
                    int n = sc.nextInt();
                    danhSachDiem.clear();
                    for (int i = 0; i < n; i++) {
                        System.out.print("Nhap diem sinh vien " + (i + 1) + ": ");
                        double diem = sc.nextDouble();
                        danhSachDiem.add(diem);
                    }
                    break;
                case 2:
                    if (danhSachDiem.isEmpty()) {
                        System.out.println("Danh sach rong");
                    } else {
                        System.out.println("Danh sach diem:");
                        for (int i = 0; i < danhSachDiem.size(); i++) {
                            System.out.println("Sinh vien" + (i + 1) + ":" + danhSachDiem.get(i));
                        }
                    }
                    break;
                case 3:
                    if (danhSachDiem.isEmpty()) {
                        System.out.println("Chua co du lieu");
                    } else {
                        double sum = 0;
                        for (double d : danhSachDiem) {
                            sum += d;
                        }
                        double avg = sum / danhSachDiem.size();
                        System.out.println("Diem trung binh: " + avg);
                    }
                    break;
                case 4:
                    if (danhSachDiem.isEmpty()) {
                        System.out.println("Chua co du lieu");
                    } else {
                        double max = danhSachDiem.get(0);
                        double min = danhSachDiem.get(0);
                        for (double d : danhSachDiem) {
                            if (d > max) max = d;
                            if (d < min) min = d;
                        }
                        System.out.println("Diem cao nhat: " + max);
                        System.out.println("Diem thap nhat: " + min);
                    }
                    break;
                case 5:
                    if (danhSachDiem.isEmpty()) {
                        System.out.println("Chua co du lieu");
                    } else {
                        int dat = 0;
                        int truot = 0;
                        for (double d : danhSachDiem) {
                            if (d >= 5) dat++;
                            else truot++;
                        }
                        System.out.println("So sinh vien dat: " + dat);
                        System.out.println("So sinh vien truot: " + truot);
                    }
                    break;
                case 6:
                    if (danhSachDiem.isEmpty()) {
                        System.out.println("Chua co du lieu");
                    } else {
                        Collections.sort(danhSachDiem);
                        System.out.println("Sap xep diem tang dan");
                    }
                    break;
                case 7:
                    if (danhSachDiem.isEmpty()) {
                        System.out.println("Chua co du lieu");
                    } else {
                        int gioiXuatSac = 0;
                        for (double d : danhSachDiem) {
                            if (d >= 8) gioiXuatSac++;
                        }
                        System.out.println("So sinh vien gioi va xuat sac: " + gioiXuatSac);
                    }
                    break;
                case 8:
                    System.out.println("Thoat chuong trinh, tam biet!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 8);
        sc.close();
    }
}

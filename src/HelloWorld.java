import java.util.Scanner;

public class HelloWorld {


    public static class Session4Ex2 {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            // ===== Khởi tạo mảng =====
            System.out.print("Nhập kích thước mảng: ");
            int size = sc.nextInt();

            int[] arr = new int[size];

            // ===== Nhập giá trị cho mảng =====
            System.out.println("Nhập " + size + " phần tử cho mảng: ");
            for (int i = 0; i < size; i++) {
                System.out.print("Phần tử thứ " + (i+1) + ": ");
                arr[i] = sc.nextInt();
            }

            // ===== Tính tổng =====
            int sum = 0;
            for(int i = 0; i < size; i++) {
                sum += arr[i];
            }

            // ===== Xuất kết quả =====
            System.out.println("Tổng các phần tử trong mảng là: " + sum);
        }
    }
}

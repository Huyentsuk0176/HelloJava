import java.util.Scanner;

public class Session4Ex4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // ===== Nhập kích thước mảng =====
        System.out.print("Nhập kích thước mảng: ");
        int size = sc.nextInt();

        // kiểm tra size hợp lệ
        if (size <= 0) {
            System.out.println("Kích thước không hợp lệ!");
            return;
        }

        // ===== Khởi tạo mảng =====
        int[] arr = new int[size];

        // ===== Nhập từng phần tử mảng =====
        System.out.println("Nhập giá trị cho mảng:");
        for (int i = 0; i < size; i++) {
            System.out.print("Phần tử thứ " + (i+1) + ": ");
            arr[i] = sc.nextInt();
        }

        // ===== Hiển thị mảng ban đầu =====
        System.out.print("Mảng ban đầu: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // ===== Đảo ngược thứ tự mảng =====
        int left = 0;          // vị trí đầu mảng
        int right = size - 1;  // vị trí cuối mảng

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }

        // ===== Hiển thị mảng sau khi đảo =====
        System.out.print("Mảng sau khi đảo ngược: ");
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}


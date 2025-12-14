import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Nhập số N
        int N = scanner.nextInt();

        if (N <= 0) {
            System.out.println("Số nhập vào không hợp lệ");
        } else {
            int sum = 0;

            // Vòng lặp for tính tổng từ 1 đến N
            for (int i = 1; i <= N; i++) {
                sum += i;
            }

            // In kết quả
            System.out.println("Tổng từ 1 đến " + N + " là: " + sum);
        }

        scanner.close();
    }
}

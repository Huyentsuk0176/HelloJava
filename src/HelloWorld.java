import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Nhập thông tin
        System.out.print("Nhập tên khách hàng: ");
        String customerName = sc.nextLine();

        System.out.print("Nhập tên sản phẩm: ");
        String productName = sc.nextLine();

        System.out.print("Nhập giá sản phẩm: ");
        double price = sc.nextDouble();

        System.out.print("Nhập số lượng mua: ");
        int quantity = sc.nextInt();

        System.out.print("Khách có phải thành viên không (true/false): ");
        boolean isMember = sc.nextBoolean();

        // Tính toán
        double subTotal = price * quantity;
        double discount = 0;

        if (isMember) {
            discount = subTotal * 0.10;
        }

        double vat = (subTotal - discount) * 0.08;
        double total = subTotal - discount + vat;

        // In kết quả
        System.out.println("\n===== HÓA ĐƠN THANH TOÁN =====");
        System.out.println("Khách hàng: " + customerName);
        System.out.println("Sản phẩm: " + productName);
        System.out.println("Giá: " + price + " VND");
        System.out.println("Số lượng: " + quantity);
        System.out.println("Thành tiền: " + subTotal + " VND");
        System.out.println("Giảm giá: " + discount + " VND");
        System.out.println("Tiền VAT (8%): " + vat + " VND");
        System.out.println("Tổng thanh toán: " + total + " VND");

        sc.close();
    }
}

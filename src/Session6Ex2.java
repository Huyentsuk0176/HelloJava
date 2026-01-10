import java.util.Scanner;
import java.util.regex.Pattern;
public class Session6Ex2 {
    static Scanner sc = new Scanner(System.in);

    // ====== Thuộc tính người dùng ======
    static String fullName = "";
    static String email = "";
    static String phone = "";
    static String password = "";

    public static void main(String[] args) {

        while (true) {
            System.out.println("QUẢN LÝ NGƯỜI DÙNG");
            System.out.println("1. Nhập thông tin người dùng");
            System.out.println("2. Chuẩn hóa họ tên");
            System.out.println("3. Kiểm tra email hợp lệ");
            System.out.println("4. Kiểm tra số điện thoại hợp lệ");
            System.out.println("5. Kiểm tra mật khẩu hợp lệ");
            System.out.println("6. Thoát");
            System.out.print("Lựa chọn của bạn: ");

            int choice;
            try {
                choice = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Vui lòng nhập số!");
                continue;
            }

            switch (choice) {
                case 1:
                    inputUser();
                    break;
                case 2:
                    normalizeName();
                    break;
                case 3:
                    checkEmail();
                    break;
                case 4:
                    checkPhone();
                    break;
                case 5:
                    checkPassword();
                    break;
                case 6:
                    System.out.println("Kết thúc chương trình!");
                    return;
                default:
                    System.out.println("Lựa chọn không hợp lệ!");
            }
        }
    }

    // 1. Nhập thông tin ======
    static void inputUser() {
        System.out.print("Nhập họ tên: ");
        fullName = sc.nextLine();

        System.out.print("Nhập email: ");
        email = sc.nextLine();

        System.out.print("Nhập số điện thoại: ");
        phone = sc.nextLine();

        System.out.print("Nhập mật khẩu: ");
        password = sc.nextLine();

        System.out.println("✅ Nhập thông tin thành công!");
    }

    // 2. Chuẩn hóa họ tên
    static void normalizeName() {
        if (fullName.isEmpty()) {
            System.out.println("Chưa có dữ liệu họ tên!");
            return;
        }

        String name = fullName.trim().toLowerCase();
        String[] words = name.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String w : words) {
            result.append(Character.toUpperCase(w.charAt(0)))
                    .append(w.substring(1))
                    .append(" ");
        }

        System.out.println("Họ tên sau chuẩn hóa: " + result.toString().trim());
    }

    // ====== 3. Kiểm tra email ======
    static void checkEmail() {
        if (email.isEmpty()) {
            System.out.println("Chưa nhập email!");
            return;
        }

        String regex = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        boolean valid = Pattern.matches(regex, email);

        if (valid) {
            System.out.println("Email hợp lệ");
        } else {
            System.out.println("Email không hợp lệ");
        }
    }

    // ====== 4. Kiểm tra số điện thoại Việt Nam ======
    static void checkPhone() {
        if (phone.isEmpty()) {
            System.out.println(" Chưa nhập số điện thoại!");
            return;
        }

        // Các đầu số phổ biến VN: 03,05,07,08,09
        String regex = "^(03|05|07|08|09)[0-9]{8}$";
        boolean valid = Pattern.matches(regex, phone);

        if (valid) {
            System.out.println(" Số điện thoại hợp lệ");
        } else {
            System.out.println("Số điện thoại không hợp lệ");
        }
    }

    // ====== 5. Kiểm tra mật khẩu ======
    static void checkPassword() {
        if (password.isEmpty()) {
            System.out.println("Chưa nhập mật khẩu!");
            return;
        }

        String regex = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*#?&]).{8,}$";
        boolean valid = Pattern.matches(regex, password);

        if (valid) {
            System.out.println("Mật khẩu hợp lệ");
        } else {
            System.out.println(" Mật khẩu không hợp lệ");
        }
    }
}


import java.util.Scanner;
public class Session5Ex4 {
    public static void
    main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap email: ");
        String email = scanner.nextLine().trim();
        String regex = "^[a-zA-Z0-9._]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)*\\.[a-zA-Z]{2,6}$";
        if (email.matches(regex)) {
            System.out.println("Email hop le");
        } else {
            System.out.println("Email hop le");
        }
        scanner.close();
    }
}

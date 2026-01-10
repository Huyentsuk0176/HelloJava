import java.util.Scanner;
public class Session5Ex3 {
    public static void
    main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap chuoi: ");
        String input = scanner.nextLine();
        String result = input.replaceAll("[0-9]", "*");
        System.out.println("Chuoi sau khi thay the: " + result);
        scanner.close();

    }
}


import java.util.Scanner;
public class Session5Ex1 {public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Nhap chuoi van ban: ");
    String text = scanner.nextLine();
    System.out.print("Nhap tu can tim: ");
    String word = scanner.nextLine();
    int position = text.indexOf(word);
    if (position != -1) {
        System.out.println("Tu\"" + word +"\" xuat hien tai vi tri " + position + "trong chuoi.");
    } else {
        System.out.println("Khong tim thay tu\"" + word + "\" trong chuoi.");
    }
    scanner.close();
}
}

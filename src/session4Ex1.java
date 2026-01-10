import java.util.Scanner;
public class session4Ex1 {
    public static void
    main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so phan tu cua mang: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i< n; i++){
            System.out.print("Nhap phan tu thu " + (i+1) + ": ");
            arr[i] =
                    sc.nextInt();
        }
        //selection sort giam dan
        for (int i = 0; i< n -1; i++){
            int maxIndex = i;
            for (int j = i+1; j < n; j++){
                if (arr[j]> arr[maxIndex]) {
                    maxIndex = j;}
                }
            int temp = arr[i];
            arr[i] = arr[maxIndex];
            arr[maxIndex] = temp;
            }
        System.out.println("\nMang sao khi sap xep giam dan:");
        for (int x : arr) {
            System.out.print(x + "");
        }
        System.out.println("\n\nPhan tu lon nhat: " + arr[0]);
    }
}

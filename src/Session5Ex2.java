public class Session5Ex2 {
    public static void
    main (String[] args){
        StringBuilder sb = new StringBuilder("Hello, Java World!");
        System.out.println("Chuoi ban dau: " + sb);
        sb.delete(5, 10);
        System.out.println("Sau khi xoa: " + sb);
        int start = sb.indexOf("World");
        int end = start + "World".length();
        sb.replace(start, end, "Universe");
        System.out.println("Sau khi thay the: " + sb );
    }
}

package session7ex2;

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book();

        myBook.setTitle("Java Programming");
        myBook.setAuthor("John Doe");
        myBook.setPrice(29.99);

        System.out.println("Tieu de: " + myBook.getTitle());
        System.out.println("Tac gia: " + myBook.getAuthor());
        System.out.println("Gia: " + myBook.getPrice());

        myBook.setPrice(35.50);
        System.out.println("Gia moi: " + myBook.getPrice());

        myBook.setPrice(-5.00);
    }
    }

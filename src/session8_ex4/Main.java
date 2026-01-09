package session8_ex4;

public class Main {
    public static void main(String[] args) {

        BankAccount accountA = new BankAccount("A001", "Nguyễn Văn A", "0123456789");
        BankAccount accountB = new BankAccount("B001", "Nguyễn Văn B", "0987654321");

        accountA.deposit(2000);

        double transferAmount = 400;
        accountA.withdraw(transferAmount); // Rút tiền từ tài khoản A
        accountB.deposit(transferAmount);   // Nạp tiền vào tài khoản B

        accountA.displayBalance();
        accountB.displayBalance();
    }
}

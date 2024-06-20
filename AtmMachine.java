import java.util.Scanner;

public class AtmMachine {

    private UserBankAccount account;
    private Scanner scanner;

    public AtmMachine(UserBankAccount account) {
        this.account = account;
        this.scanner = new Scanner(System.in);
    }

    public void start() {

        while (true) {
            System.out.println("1. DEPOSIT");
            System.out.println("2. WITHDRAW");
            System.out.println("3. CHECK BALANCE");
            System.out.println("0. EXIT");
            System.out.print("Select option: ");
            int option = Integer.valueOf(scanner.nextLine());

            System.out.println();

            if (option == 1) {
                System.out.print("Enter amount: ");
                double amount = Double.valueOf(scanner.nextLine());
                account.deposit(amount);
            } else if (option == 2) {
                System.out.print("Enter amount: ");
                double amount = Double.valueOf(scanner.nextLine());
                account.withdraw(amount);
            } else if (option == 3) {
                account.getBalance();
            } else if (option == 0) {
                break;
            } else {
                System.out.println("Invalid choice. Try again");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        UserBankAccount account = new UserBankAccount(100.0);

        AtmMachine atmAccount = new AtmMachine(account);

        atmAccount.start();

    }
}
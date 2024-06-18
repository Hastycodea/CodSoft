import java.util.Scanner;

public class AtmMachine {

    private UserBankAccount account;
    private Scanner scanner;

    public AtmMachine(UserBankAccount account, Scanner scanner) {
        this.account = new UserBankAccount(0);
        this.scanner = new Scanner(System.in);
    }

    public void start() {

        while (true) {
            System.out.println("1. DEPOSIT");
            System.out.println("2. WITHDRAW");
            System.out.println("3. CHECK BALANCE");
            System.out.println("0. EXIT");
            System.out.println("Select option: ");
            int option = Integer.valueOf(scanner.nextLine());

            System.out.println();

            if (option == 1) {
                System.out.println("Enter amount: ");
                double amount = Double.valueOf(scanner.nextLine());
                account.deposit(amount);
            } else if (option == 2) {
                System.out.println("Enter amount: ");
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
        Scanner scanner = new Scanner(System.in);
        UserBankAccount account = new UserBankAccount(60);

        AtmMachine atmAccount = new AtmMachine(account, scanner);

        atmAccount.start();

    }
}
public class UserBankAccount {
    private double balance;

    public UserBankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Balance: " + balance);
        } else {
            System.out.println("Failed! Wrong Amount or Invalid amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            balance -= amount;
            System.out.println("Withdrawed: " + amount);
            System.out.println("Balance: " + balance);            
        } else {
            System.out.println("Insufficient funds/ invalid amount");
        }
    }

    public void getBalance() {
        System.out.println("Balance: "+ balance);
    }


        
}

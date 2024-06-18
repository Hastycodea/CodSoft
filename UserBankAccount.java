public class UserBankAccount {
    private double balance;

    public UserBankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Balance: " + this.balance);
        } else {
            System.out.println("Failed! Wrong Amount or Invalid amount");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            this.balance -= amount;
            System.out.println("Withdrawed: " + amount);
            System.out.println("Balance: " + this.balance);            
        } else {
            System.out.println("Insufficient funds/ invalid amount");
        }
    }

    public void getBalance() {
        System.out.println("Balance: "+ this.balance);
    }


        
}

abstract class BankAccount {
    protected double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);

    public double getBalance() {
        return balance;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

class CurrentAccount extends BankAccount {
    public CurrentAccount(double initialBalance) {
        super(initialBalance);
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        }
    }
}

public class BankAccountTest {
    public static void main(String[] args) {
        SavingsAccount savings = new SavingsAccount(1000.0);
        CurrentAccount current = new CurrentAccount(1500.0);

        savings.deposit(500.0);
        savings.withdraw(200.0);

        current.deposit(300.0);
        current.withdraw(100.0);

        System.out.println("Savings Account Balance: $" + savings.getBalance());
        System.out.println("Current Account Balance: $" + current.getBalance());
    }
}

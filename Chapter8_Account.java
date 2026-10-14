// Chapter8_Account.java
class Account {
    private double balance;

    public Account(double initial) {
        if (initial > 0)
            balance = initial;
    }

    public void deposit(double amount) {
        if (amount > 0)
            balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}

public class Chapter8_Account {
    public static void main(String[] args) {
        Account acc = new Account(1000);
        acc.deposit(500);
        System.out.println("Balance: " + acc.getBalance());
    }
}
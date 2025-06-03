package ch06.quiz;

public class Account {
    static final int MIN_BALANCE = 0;
    static final int MAX_BALANCE = 1000000;
    private int balance;

    public void setBalance(int balance) {
        if (balance >= MIN_BALANCE && balance <= MAX_BALANCE) {
            this.balance = balance;
        }
    }

    public int getBalance() {
        return balance;
    }
}

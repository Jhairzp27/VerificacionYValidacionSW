package epn.verif;

public class SmartWallet {
    private double balance;
    private String userType;
    private String status;


    public SmartWallet(double balance, String userType) {
        this.balance = balance;
        this.userType = userType;
        this.status = "Activa";
    }

    public boolean deposit(double amount){
        if (amount <= 0) return false;

        double potencialCashback = 0;
        if (amount > 100){
            potencialCashback = amount * 0.01;
        }

        double finalBalance = balance + amount + potencialCashback;

        if (userType.equals("Standard") && finalBalance > 5000) {
            return false;
        }

        this.balance = finalBalance;
        return true;
    }

    public boolean withdraw(double amount){
        if (amount <= 0 || amount > balance) return false;

        this.balance -= amount;

        if (this.balance == 0) {
            this.status = "Inactiva";
        }
        return true;
    }

    public double getBalance() {
        return balance;
    }

    public String getUserType() {
        return userType;
    }

    public String getStatus() {
        return status;
    }
}
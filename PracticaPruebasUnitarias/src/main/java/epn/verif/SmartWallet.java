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
        //TODO: Implementar lógica de depósito
        return false;
    }

    public boolean withdraw(double amount){
        //TODO: Implementar lógica de retiro
        return false;
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
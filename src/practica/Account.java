package practica;

public class Account {
    private double balance;

    public Account(double initBalance){
        this.balance=initBalance;
    }

    public Account(){}

    public double getBalance() {
        return balance;
    }

    public double deposit(double amt){
        this.balance=getBalance()+amt;
        return this.balance;
    }

    public double withdraw(double amt){
        if (this.balance<amt){
            return this.balance;
        }
        this.balance=getBalance()-amt;
        return this.balance;
    }
}

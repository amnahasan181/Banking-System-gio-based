public abstract class gui {
    public double balance;
    public gui(double initialBalance) {
        this.balance = initialBalance >= 0 ? initialBalance : 0;
    }
    public double getBalance() {
        return balance;
    }
    protected void setBalance(double balance) {
        this.balance = balance;
    }
    public double transferto(double amount){
    if (amount<= balance){
       balance=balance-amount;
    }
    else{
        System.out.println("Amount exceeded balance");
    }
    return balance;
}
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
}
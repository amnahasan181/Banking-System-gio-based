public class SavingsAccount extends gui {
    private int accountNumber;
    public SavingsAccount(double initialBalance,int accountNumber) {
        super(initialBalance);
                this.accountNumber = accountNumber;
    }
    public int getAccountNumber() {
        return accountNumber;
    }
    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            setBalance(getBalance() + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    @Override
    public void withdraw(double amount) {
        if (amount > 0 && getBalance() >= amount) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Invalid withdrawal or insufficient funds");
        }
    }
      
}





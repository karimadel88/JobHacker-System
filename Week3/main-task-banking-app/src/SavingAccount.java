public class SavingAccount extends Account {
    private double interestRate; // Interest rate specific to SavingAccount

    public SavingAccount(String accountNumber, String accountName, double accountBalance, double interestRate) {
        super(accountNumber, accountName); // Call parent class constructor to initialize accountNumber and accountName
        this.interestRate = interestRate; // Initialize interestRate specific to SavingAccount
    }

    public boolean calculateInterest() {
        double interest = getAccountBalance() * this.interestRate / 100; // Calculate interest based on account balance and interest rate
        deposit(interest); // Deposit calculated interest into the account
        return true; // Return true if interest calculation is successful
    }
}

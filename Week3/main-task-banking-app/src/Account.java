public class Account {
    protected String accountNumber; // Account number
    protected String accountName; // Account name
    protected double accountBalance; // Account balance

    public Account(String accountNumber, String accountName) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.accountBalance = 0; // Initialize account balance to 0
    }

    public boolean deposit(double balance) {
        if (balance < 0) { // Check if deposited balance is negative
            return false; // Return false if negative balance is deposited
        }
        this.accountBalance += balance; // Add deposited balance to account balance
        return true; // Return true if deposit is successful
    }

    public boolean withdraw(double balance) {
        if (balance < 0 || this.accountBalance < balance) { // Check if withdrawal amount is negative or greater than account balance
            return false; // Return false if withdrawal is not possible
        }
        this.accountBalance -= balance; // Subtract withdrawal amount from account balance
        return true; // Return true if withdrawal is successful
    }

    public String getAccountNumber() {
        return accountNumber; // Get account number
    }

    public String getAccountName() {
        return accountName; // Get account name
    }

    public double getAccountBalance() {
        return accountBalance; // Get account balance
    }
}

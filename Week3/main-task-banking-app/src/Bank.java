import java.util.ArrayList;

public class Bank {
    // ArrayList to store Account objects
    private ArrayList<Account> accounts;

    public Bank() {
        // Initialize accounts ArrayList when Bank object is created
        this.accounts = new ArrayList<>();
    }

    public boolean addNewAccount(Account account){
        // Check if account with same account number already exists
        if(checkExistAccount(account.getAccountNumber()) != null){
            return false; // If account already exists, return false
        }
        accounts.add(account); // Add the new account to the accounts ArrayList
        return true; // Return true if account is added successfully
    }

    public boolean deposit(Account account, double balance){
        return account.deposit(balance); // Call deposit() method of Account class to deposit balance to the specified account
    }

    public boolean withdraw(Account account, double balance){
        boolean withdrawCheck = account.withdraw(balance); // Call withdraw() method of Account class to withdraw balance from the specified account
        if(withdrawCheck){
            return true; // If withdrawal is successful, return true
        }
        else {
            System.out.println("Error at the balance try again"); // Print error message if withdrawal fails
            return false; // Return false if withdrawal fails
        }
    }

    public void displayBalance(Account account){
        // Display the account balance
        System.out.println("Your Balance is " + account.getAccountBalance());
    }

    public Account checkExistAccount(String accountNumber){
        for (Account account : accounts) { // Loop through the accounts ArrayList
            if (account.getAccountNumber().equals(accountNumber)) { // Check if account number matches
                return account; // Return the account if found
            }
        }
        return null; // Return null if account not found
    }
}

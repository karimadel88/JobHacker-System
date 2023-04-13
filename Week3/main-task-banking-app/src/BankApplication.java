import java.util.Scanner;

public class BankApplication {
    private static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        Bank bank = new Bank();
        boolean exit = true;
        int choice;
        while (exit){
            System.out.println("Welcome in v bank");
            //System.out.println("1. Add New Account\n2. Deposit Balance\n3. Withdraw Balance\n4. Display Your Available Balance\n4. Exit");
            System.out.println("1. Add New Account\n2. Login in\n3. exit");
            choice = in.nextInt();
            switch (choice){
                case 1:{
                    // Create a new account and add it to the bank
                    Account account = createAccount();
                    boolean checkAdding = bank.addNewAccount(account);
                    if (checkAdding){
                        System.out.println("Your Account has created Successfully ^-^");
                    }
                    else {
                        System.out.println("This Account Already exist!");
                    }
                    break;
                }
                case 2:{
                    // Login to an existing account and display user screen
                    userScreen(bank,inputAccountNumber());
                    break;

                }
                case 3:
                    exit = false;
                    break;
                default:
                    System.out.println("Enter Correct Choice");
            }
        }

    }

    // Create a new account by taking user input for account number and name
    public static Account createAccount(){
        return new Account(inputAccountNumber(),inputName());
    }

    // Take user input for account name
    public static String inputName(){
        System.out.println("Enter Your Account Name");
        return in.next();
    }

    // Take user input for account number
    public static String inputAccountNumber(){
        System.out.println("Enter Your Account Number");
        return in.next();
    }

    // Display user screen after successful login
    public static void userScreen (Bank bank, String accountNumber) {
        Account account = bank.checkExistAccount(accountNumber);
        if(account != null){
            System.out.println("Welcome " + account.accountName);
            while (true) {
                // Display user options for deposit, withdraw, display balance, and logout
                System.out.println("1. Deposit\n2. Withdraw\n3. Display Balance\n0. Log out");
                int choice = in.nextInt();
                if(choice <= 0 || choice >3){
                    return;
                }
                // Call userChoice() method based on user input
                userChoice(choice,bank,account);
            }

        }else {
            System.out.println("This account don't exist try again");
        }
    }

    // Perform user's choice based on input
    public static void userChoice(int choice,Bank bank,Account account){
        switch (choice){
            case 1:{
                // Deposit balance to the account
                System.out.println("Enter Balance to deposit it");
                double balance = in.nextDouble();
                if(bank.deposit(account,balance)){
                    System.out.print("Your Balance Deposited successfully and your balance is ");
                    bank.displayBalance(account);
                }else {
                    System.out.println("Error in your balance try again");
                }
            }
            break;
            case 2:{
                // Withdraw balance from the account
                System.out.println("Enter Balance to withdraw it");
                double balance = in.nextDouble();
                if(bank.withdraw(account,balance)){
                    System.out.print("Your Balance withdraw successfully and your balance is ");
                    bank.displayBalance(account);
                }else {
                    System.out.println("Error in your available balance try again");
                }

            }
            break;
            case 3:{
                // Display current balance of the account
                System.out.print("Your Balance is : ");
                bank.displayBalance(account);
            }
            break;
            default:
                System.out.println("Enter Correct choice");
        }
    }
}
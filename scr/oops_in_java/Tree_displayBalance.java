package oops_in_java;

public class Tree_displayBalance {
    int balance = 0;

    public static <Four_discount> void main(String[] args) {
        Tree_displayBalance account1 = new Tree_displayBalance();
        Tree_displayBalance account2 = new Tree_displayBalance(150);
        account1.deposit(250);
        account2.withdraw(100);
        account2.displayBalance();
    }

    // Constructor without arguments
    public Tree_displayBalance() {
        System.out.println("Welcom");
    }
    // Constructor with initial balance
    public Tree_displayBalance(int initialBalance) {
        balance = initialBalance;
    }
    // Method to deposit amount to the account
    public void deposit(int amount) {
        balance += amount;
        System.out.println("Deposit account is " + amount);
    }
    // Method to withdraw amount from the account
    public void withdraw(int amount) {
        balance -= amount;
        System.out.println("Withdraw account is " + amount);
    }
    // Method to display the balance amount
    public void displayBalance() {
        System.out.println("Your account balance is: " + balance);
    }
   
}

// out put 
// Welcom
// Deposit account is 250
// Withdraw account is 100    
// Your account balance is: 5
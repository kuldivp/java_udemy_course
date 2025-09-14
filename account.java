/*6. Constructor with Validation

Write a Java program to create a class called Account with instance variables accountNumber and balance. 
Implement a parameterized constructor that initializes these variables with validation:
accountNumber should be non-null and non-empty.
balance should be non-negative.
Print an error message if the validation fails.
 */

public class account {   // class names should start with uppercase

    String acc_num;
    int balance;

    // Parameterized constructor with validation
    account(String acc_num, int balance) {
        if (acc_num == null || acc_num.trim().isEmpty()) {
            System.out.println("Error: Account number cannot be null or empty.");
        } else if (balance < 0) {
            System.out.println("Error: Balance cannot be negative.");
        } else {
            this.acc_num = acc_num;
            this.balance = balance;
        }
    }

    // Getter methods
    public String getAccNum() {
        return acc_num;
    }

    public int getBalance() {
        return balance;
    }

    // Main method to test
    public static void main(String[] args) {
        account acc1 = new account("12345", 1000);  // valid
        account acc2 = new account("", 500);        // invalid
        account acc3 = new account("   ", -10);     // invalid
        account acc4 = new account(null, 50);       // invalid

        // Print valid account details
        if (acc1.getAccNum() != null) {
            System.out.println("Account Number: " + acc1.getAccNum());
            System.out.println("Balance: " + acc1.getBalance());
        }
    }
}


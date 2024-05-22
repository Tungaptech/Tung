package aptech.eBanking.ebank;

public class AccountBank {
    private String accountNumber;
    private double balance;
    private String accountHolderName;

    public AccountBank() {
        this.accountNumber = "";
        this.balance = 0.0;
        this.accountHolderName = "";
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.err.println("You can't deposit negative amount");
            return;
        }
        this.balance += amount;
        System.out.println("Tranfer successful");
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.err.println("You can't withdraw negative amount");
            return;
        }
        if (amount > this.balance) {
            System.err.println("You can't withdraw more than your account");
            return;
        }
        this.balance -= amount;
        System.out.println("Transfer successful");
    }

    public void transfer(String destinationAccountNumber, double amount) {
        //Main.accountBanks
        if (amount <= 0) {
            System.err.println("You can't transfer negative amount");
            return;
        }
        if (amount > this.balance) {
            System.err.println("You can't transfer more than your account");
            return;
        }
        int destinationAccountNumberIndex = -1;
        for (int i = 0; i < Main.accountBanks.size(); i++) {
            AccountBank accountBank = Main.accountBanks.get(i);
            if (accountBank.getAccountNumber().equals(destinationAccountNumber)) {
                destinationAccountNumberIndex = i;
            }
        }
        if (destinationAccountNumberIndex == -1) {
            System.err.println("Destination account number does not exist");
            return;
        }
//validated, process
        this.balance -= amount;
        AccountBank destinationAccountBank = Main.accountBanks.get(destinationAccountNumberIndex);
        destinationAccountBank.setBalance(destinationAccountBank.getBalance() + amount);
        System.out.println("Transfer successful");
    }

    public void displayAccountInfo(){
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Balance: " + this.balance);
        System.out.println("Account Holder Name: " + this.accountHolderName);
    }


    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }
}

package aptech.eBanking.ebank;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static ArrayList<AccountBank> accountBanks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number: ");
        String accountNumber = scanner.nextLine();
        System.out.println("Enter account hoder name: ");
        String accountHoderName = scanner.nextLine();
        System.out.println("Enter account balance: ");
        double balance = scanner.nextDouble();
        scanner.nextLine();
        AccountBank accountBank = new AccountBank();
        accountBank.setBalance(balance);
        accountBank.setAccountNumber(accountNumber);
        accountBank.setAccountHolderName(accountHoderName);
        System.out.println("Your account balance is: " + accountBank.getBalance());
        //test deposit
        System.out.println("Test deposit method");
        System.out.println("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        scanner.nextLine();
        //double depositAmount = 2000;
        System.out.println("Your deposit amount is: " + depositAmount);
        accountBank.deposit(depositAmount);
        System.out.println("Your account balance after deposit is: " + accountBank.getBalance());
        //test withdraw
        System.out.println("Test withdraw method");
        System.out.println("Enter withdraw amount: ");
        double withdrawAmount = scanner.nextDouble();
        scanner.nextLine();
        //double withdrawAmount = 5000;
        System.out.println("Your withdraw amount is: " + withdrawAmount);
        accountBank.withdraw(withdrawAmount);
        System.out.println("Your account balance after withdraw is: " + accountBank.getBalance());
        //test transfer
        System.out.println("Test transfer method");
        AccountBank destinationAccountBank = new AccountBank();
        destinationAccountBank.setBalance(10000);
        destinationAccountBank.setAccountNumber("091");
        destinationAccountBank.setAccountHolderName("Nghiem Thanh Tung");
        accountBanks.add(destinationAccountBank);
        accountBanks.add(accountBank);
        System.out.println("Destination account");
        destinationAccountBank.displayAccountInfo();

        System.out.println("Enter transfer amount: ");
        double transferAmount = scanner.nextDouble();
        scanner.nextLine();

        accountBank.transfer("091",transferAmount);
        System.out.println("My acount");
        System.out.println("After transfer transaction");
        destinationAccountBank.displayAccountInfo();
        System.out.println("Destination account");
        destinationAccountBank.displayAccountInfo();
    }

}

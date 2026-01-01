package function.company;

/*
 Create a bank account management system.

 Account should have information like:
 1. Account number
 2. Account holder name
 3. Account type
 4. Current balance

 User should be able to:
 - Create a new account
 - Deposit money
 - Withdraw money
 - Check account balance

 Assume that account numbers are unique and auto-generated.
*/


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

class Account{
    double AccountNo;
    String HolderName;
    String AccountType;
    double CurrentBalance;

    Account(double AccountNo, String HolderName, String AccountType, double CurrentBalance){
        this.AccountNo = AccountNo;
        this.HolderName = HolderName;
        this.AccountType = AccountType;
        this.CurrentBalance = CurrentBalance;
    }

}

class BankSystem{
    ArrayList<Account> database = new ArrayList<>();

    void CreateNewAccount(String name, String type, double balance){
        Random rn = new Random();
        long min = 1_000_000_000L;   // smallest 10-digit number
        long max = 9_999_999_999L;   // largest 10-digit number

        long accNumber = min +
                (long)(rn.nextDouble() * (max - min + 1));
        database.add(new Account(accNumber, name,type, balance ));
        System.out.println("Your Account is created. Your bank account no. is : " + accNumber);
    }


    void DepositeMoney(double acc, double balance, String name) {
        for (Account cust : database){
            if(cust.AccountNo == acc && cust.HolderName.equalsIgnoreCase(name)){
                cust.CurrentBalance += balance;
            }
            System.out.println("Your Transaction is successful");
            System.out.println("Thank You");
            return;
        }
        System.out.println("Account Not found");
    }

    void WithdrawMoney(double acc, double balance, String name) {
        for (Account cust : database){
            if(cust.AccountNo == acc && cust.HolderName.equalsIgnoreCase(name)){
                cust.CurrentBalance -= balance;
                if(cust.CurrentBalance < 0){
                    System.out.println("Bounce");
                    return;
                }
            }
            System.out.println("Your Withdrawn is successful");
            System.out.println("Thank You");
            return;
        }
        System.out.println("Account Not found");
    }

    void CheckBalance(double acc) {
        for (Account cust : database){
            if(cust.AccountNo == acc ){
                System.out.println("===================================");
                System.out.println("Name : " + cust.HolderName);
                System.out.println("Account No. : " + cust.AccountNo);
                System.out.println("Account Type : " + cust.AccountType);
                System.out.println("Balance : " + cust.CurrentBalance);
                System.out.println("===================================");
                return;

            }

        }
        System.out.println("Account Not found");
    }

}

public class BankManagementSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankSystem bank = new BankSystem();
        while (true){
            System.out.println("\n1. Create New Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Name: ");
                    String name = sc.nextLine();
                    System.out.print("Type : ");
                    String type = sc.nextLine();
                    System.out.print("Balance: ");
                    double balance = sc.nextDouble();
                    bank.CreateNewAccount(name, type, balance);
                    break;
                case 2:
                    System.out.print("Name: ");
                    name = sc.nextLine();
                    System.out.print("Account No. : ");
                    double acc = sc.nextDouble();
                    System.out.print("Balance: ");
                    balance = sc.nextDouble();
                    bank.DepositeMoney(acc, balance, name);
                    break;
                case 3:
                    System.out.print("Name: ");
                    name = sc.nextLine();
                    System.out.print("Account No. : ");
                    acc = sc.nextDouble();
                    System.out.print("Balance: ");
                    balance = sc.nextDouble();
                    bank.WithdrawMoney(acc, balance, name);
                    break;
                case 4:
                    System.out.print("Account No. : ");
                    acc = sc.nextDouble();
                    bank.CheckBalance(acc);
                    break;
                case 5:
                    System.out.println("Thank You");
                    System.exit(0);
            }

        }
    }
}

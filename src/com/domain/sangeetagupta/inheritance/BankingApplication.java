package com.domain.sangeetagupta.inheritance;

public class BankingApplication {
    public static void main(String... args){
        Account account = new SavingsAccount(101,"Sangeeta",10000f,"Poppie");
        System.out.println(account);

        account.deposit(2000);
        System.out.println(account);

        account.withdraw(11000);
        System.out.println(account);

        account.withdraw(500);
        System.out.println(account);

        Account currentAccount = new CurrentAccount(102, "Aastha",20000f,"Symbiosis");

        account.withdraw(500000);
    }
}

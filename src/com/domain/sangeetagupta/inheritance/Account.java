package com.domain.sangeetagupta.inheritance;

public class Account {
    //variable declaration
    private int accountNumber;
    private String accountHolderName;
    protected float balance;

    //non-paramterized constructor
    public Account(){ super(); }

    //parameterized constructor
    public Account(int accountNumber,String accountHolderName,float balance){
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    //getters and setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String toString(){
        return accountNumber + " " + accountHolderName + " " + balance;
    }

    public void withdraw(float amount){
        balance = balance - amount;
    }

    public void deposit(float amount){
        balance = balance + amount;
    }
}

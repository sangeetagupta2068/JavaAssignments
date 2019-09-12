package com.domain.sangeetagupta.inheritance;

public class SavingsAccount extends Account{
    //constant declaration
    private static final float MINIMUM_BALANCE = 1000.0f;

    //variable declaration
    private String nominee;

    //non-parameterized constructor
    public SavingsAccount(){ super();}

    //parameterized constructor
    public SavingsAccount(int accountNumber,String accountHolderName,float balance,String nominee){
        super(accountNumber,accountHolderName,balance);
        this.nominee = nominee;
    }

    //getters and setters
    public String getNominee() {
        return nominee;
    }

    public void setNominee(String nominee) {
        this.nominee = nominee;
    }

    @Override
    public String toString(){
        return super.toString() + " " + nominee;
    }

    //business logic
    @Override
    public void withdraw(float amount){
        if(balance >= MINIMUM_BALANCE){
            balance = balance - amount;
        } else {
            System.out.println("Cannot withdraw money!Insufficient balance!");
        }
    }

}

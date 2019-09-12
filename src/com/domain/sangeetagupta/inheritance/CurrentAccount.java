package com.domain.sangeetagupta.inheritance;

public class CurrentAccount extends Account {
    //constant declaration
    private static final float MINIMUM_BALANCE = 5000.0f;

    private String crn;

    CurrentAccount(){ super();}

    CurrentAccount(int accountNumber,String accountHolderName,float balance,String crn){
        super(accountNumber,accountHolderName,balance);
        this.crn = crn;
    }

    //getters and setters
    public String getCrn() {
        return crn;
    }

    public void setCrn(String crn) {
        this.crn = crn;
    }

    @Override
    public String toString(){
        return super.toString() + " " + crn;
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

package com.domain.sangeetagupta.abstract_class_implementation;

public abstract class Vehicle {
    //data member declaration
    private String mRegistrationNumber;
    private String mCompanyName;
    private float mPrice;

    public Vehicle(){}

    public Vehicle(String registrationNumber, String companyName, float price){
        this.mRegistrationNumber = registrationNumber;
        this.mCompanyName = companyName;
        this.mPrice = price;
    }

    //abstract methods
    public abstract void accelerate();
    public abstract void start();
    public abstract void stop();

    //getters and setters
    public String getmRegistrationNumber() {
        return mRegistrationNumber;
    }

    public void setmRegistrationNumber(String mRegistrationNumber) {
        this.mRegistrationNumber = mRegistrationNumber;
    }

    public String getmCompanyName() {
        return mCompanyName;
    }

    public void setmCompanyName(String mCompanyName) {
        this.mCompanyName = mCompanyName;
    }

    public float getmPrice() {
        return mPrice;
    }

    public void setmPrice(float mPrice) {
        this.mPrice = mPrice;
    }
}

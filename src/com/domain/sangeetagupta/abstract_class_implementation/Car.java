package com.domain.sangeetagupta.abstract_class_implementation;

public class Car extends Vehicle {
    //data member declaration
    private int mNumberOfPassengers;

    public Car(){}

    public Car(int numberOfPassengers,String registrationNumber,String companyName,float price){
        super(registrationNumber,companyName,price);
        this.mNumberOfPassengers = numberOfPassengers;
    }

    //abstract method implementation

    //this accelerates the car
    @Override
    public void accelerate() {
        System.out.println("Car accelerated!");
    }

    //this starts the car
    @Override
    public void start() {
        System.out.println("Car started!");
    }

    //this stops the car
    @Override
    public void stop() {
        System.out.println("Car stopped!");
    }

    //getter and setter
    public int getmNumberOfPassengers() {
        return mNumberOfPassengers;
    }

    public void setmNumberOfPassengers(int mNumberOfPassengers) {
        this.mNumberOfPassengers = mNumberOfPassengers;
    }
}

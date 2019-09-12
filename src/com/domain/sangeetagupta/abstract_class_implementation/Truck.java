package com.domain.sangeetagupta.abstract_class_implementation;

public class Truck extends Vehicle {
   //data member declaration
    private int mLoadingCapacity;

    public Truck(){}

    public Truck(int loadingCapacity,String registrationNumber,String companyName,float price){
        super(registrationNumber,companyName,price);
        this.mLoadingCapacity = loadingCapacity;
    }

    //abstract method implementation

    //this acclerates the truck
    @Override
    public void accelerate() {
        System.out.println("Truck Accelerated!");
    }

    //this starts the truck
    @Override
    public void start() {
        System.out.println("Truck Started!");
    }

    //this stops the truck
    @Override
    public void stop() {
        System.out.println("Truck stopped!");
    }

    //getter and setter
    public int getmLoadingCapacity() {
        return mLoadingCapacity;
    }

    public void setmLoadingCapacity(int mLoadingCapacity) {
        this.mLoadingCapacity = mLoadingCapacity;
    }
}

package com.domain.sangeetagupta.abstract_class_implementation;

public class VehicleApplication {
    public static void main(String... args){
        Vehicle vehicle = new Car(4,"AB1234","Maruti",50000.0f);
        vehicle.start();
        vehicle.accelerate();
        vehicle.stop();
        Car car = (Car) vehicle;
        System.out.println(((Car) vehicle).getmNumberOfPassengers());

        vehicle = new Truck(2,"MS1234","Mahindra",120000.0f);
        vehicle.start();
        vehicle.accelerate();
        vehicle.stop();
    }
}

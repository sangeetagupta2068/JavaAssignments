package com.domain.sangeetagupta.garbage_collection;

public class Balloon {
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
        System.out.println("Balloon created!");
    }

    private String color;
    Balloon(String color){
        this.color = color;
    }

    @Override
    protected void finalize(){
        System.out.println("Removing thread");
    }
}

package com.domain.sangeetagupta.file_handling;

import java.io.Serializable;

public class Book implements Serializable {
    private int bookNumber;
    private String name;
    private  transient float price;

    public Book(){}

    public Book(int bookNumber,String name,float price){
        this.bookNumber = bookNumber;
        this.name = name;
        this.price = price;
    }


    public int getBookNumber() {
        return bookNumber;
    }

    public void setBookNumber(int bookNumber) {
        this.bookNumber = bookNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void display(){
        System.out.println(bookNumber + name + price);
    }
}

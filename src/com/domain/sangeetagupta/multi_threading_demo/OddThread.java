package com.domain.sangeetagupta.multi_threading_demo;

public class OddThread extends Thread{

    public OddThread(String name){
        super(name);
    }
    @Override
    public void run(){
        for(int i = 1; i<=10; i+=2){
            System.out.println(i + " " + getName());
        }
    }
}

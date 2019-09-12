package com.domain.sangeetagupta.multi_threading_demo;

public class EvenThread extends Thread {

    public EvenThread(String name){
        super(name);
    }
    //soul of thread
    @Override
    public void run() {
        super.run();
        for(int i = 0; i <=10; i=i+2){
            System.out.println(i + " " + getName());
        }

        //pauses current running thread
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

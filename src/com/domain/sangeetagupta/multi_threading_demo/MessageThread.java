package com.domain.sangeetagupta.multi_threading_demo;

public class MessageThread extends Thread {


    private String message;
    private CallMe callMe;

    public MessageThread(CallMe callMe,String message){
        this.message = message;
        this.callMe = callMe;
    }
    @Override
    public void run(){
        //call print method
        //one way
        synchronized (callMe) {
            callMe.print(message);
        }
    }
}

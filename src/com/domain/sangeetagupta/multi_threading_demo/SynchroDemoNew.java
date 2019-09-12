package com.domain.sangeetagupta.multi_threading_demo;

public class SynchroDemoNew {

    public static void main(String... args){

        System.out.println("Start");

        CallMe callMe = new CallMe();
        MessageThread messageThread = new MessageThread(callMe,"Message1");
        MessageThread messageThread1 = new MessageThread(callMe,"Message2");
        MessageThread messageThread2 = new MessageThread(callMe,"Message3");

        messageThread.start();
        messageThread1.start();
        messageThread2.start();

        try {
            messageThread.join();
            messageThread1.join();
            messageThread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("End");

    }
}

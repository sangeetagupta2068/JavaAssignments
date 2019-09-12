package com.domain.sangeetagupta.multi_threading_demo;

public class CallMe {

    //second way
//    synchronized public void print(String message){
//        System.out.print("[" + message);
//
//        try {
//            Thread.sleep(2000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
//
//        System.out.print("]");
//    }

    public void print(String message){
        System.out.print("[" + message);

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.print("]");
    }
}

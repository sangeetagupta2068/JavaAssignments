package com.domain.sangeetagupta.multi_threading_demo;

public class Basket {
    private int num;
    private boolean flag = true;

    public synchronized int getNum() {
        if (flag) {
            try {
                //release the lock
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Consumed num" + num);
        flag = true;
        notify();
        return num;
    }

    synchronized public void setNum(int num) {

        if (!(flag)) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.num = num;
        System.out.println("Produced num: " + this.num);
        flag = false;
        notify();
    }
}

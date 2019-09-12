package com.domain.sangeetagupta.multi_threading_demo;

public class Producer extends Thread {

    private Basket basket;

    public Producer(Basket basket) {
        this.basket = basket;
    }

    @Override
    public void run() {
        for (int count = 0; count < 10; count++) {
            basket.setNum(count);
        }
    }
}

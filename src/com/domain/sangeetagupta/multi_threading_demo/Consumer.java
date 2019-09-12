package com.domain.sangeetagupta.multi_threading_demo;

public class Consumer extends Thread {

        private Basket basket;

        public Consumer(Basket basket) {
            this.basket = basket;
        }

        @Override
        public void run() {
            for (int count = 0; count < 10; count++) {
                basket.getNum();
            }
        }
}

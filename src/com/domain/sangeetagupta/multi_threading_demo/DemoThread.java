package com.domain.sangeetagupta.multi_threading_demo;

public class DemoThread {

    public static void main(String... args) {
        System.out.println("start");
        EvenThread evenThread = new EvenThread("Even");
        OddThread oddThread = new OddThread("Odd");

        //we never call run method explicitly in multi threading else it behaves like normal method
        //four threads running-> even and odd child thread. Main thread, daemon thread.
        //main should exit last for cleanup work. Main wants some input from other thread, main has to pause.

        evenThread.start();
        oddThread.start();
        System.out.println("Even state: " + evenThread.isAlive());
        System.out.println("Odd state: " + oddThread.isAlive());
        try {
            //calling thread is paused (Main thread paused)
            //isAlive() checks if thread is alive
            evenThread.join();
            oddThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Even state: " + evenThread.isAlive());
        System.out.println("Odd state: " + oddThread.isAlive());
        System.out.println("stop");
    }
}

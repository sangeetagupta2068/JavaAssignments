package com.domain.sangeetagupta.collection_demo;

import java.util.ArrayList;

public class CollectionThreadDemo {

    public static ArrayList<Integer> getArrayList() {
        return arrayList;
    }

    private static ArrayList<Integer> arrayList = new ArrayList<>();

    public static void main(String... args) {

        CollectionThread collectionThread = new CollectionThread(1, 10);
        CollectionThread collectionThread1 = new CollectionThread(11, 20);
        CollectionThread collectionThread2 = new CollectionThread(21, 30);

        collectionThread.start();
        collectionThread1.start();
        collectionThread2.start();


        try {
            collectionThread.join();
            collectionThread1.join();
            collectionThread2.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        int sum = 0;
        for (int num :
                arrayList) {
            sum = sum + num;
        }

        System.out.println(sum);

    }
}

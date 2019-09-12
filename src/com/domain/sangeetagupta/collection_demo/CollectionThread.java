package com.domain.sangeetagupta.collection_demo;

import java.util.ArrayList;

public class CollectionThread extends Thread {

    private int start;
    private int end;

    public CollectionThread(int start, int end){
        this.start = start;
        this.end = end;
    }

    @Override
    public void run(){
        for(int count = start; count < end; count++ ){
            System.out.println(count);
            CollectionThreadDemo.getArrayList().add(count);
        }
    }
}

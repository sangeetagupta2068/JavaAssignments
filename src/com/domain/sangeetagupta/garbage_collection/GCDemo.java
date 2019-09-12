package com.domain.sangeetagupta.garbage_collection;

public class GCDemo{
    public static void main(String... args){
        Balloon balloon = new Balloon("Red");
        balloon = null;
        System.gc();
    }
}

package com.domain.sangeetagupta.collection_demo;

import java.util.HashSet;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String... args){
        HashSet<String> hashSet  = new HashSet<>();
        hashSet.add("Beena");
        hashSet.add("Meena");
        hashSet.add("Leena");
        hashSet.add("Aeena");

        //ignore duplicate value and doesn't throw any compilation or runtime error
        //internally hashing used to store values
        System.out.println(hashSet);
        System.out.println(hashSet.contains("Beena"));

        //iterate through set using iterator or foreach loop

        TreeSet<String> treeSet  = new TreeSet<>();
        treeSet.add("Beena");
        treeSet.add("Meena");
        treeSet.add("Leena");
        treeSet.add("Aeena");

        //ignore duplicate value and doesn't throw any compilation or runtime error
        //internally hashing used to store values
        System.out.println(treeSet);
        System.out.println(hashSet.contains("Beena"));

    }
}

package com.domain.sangeetagupta.collection_demo;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class MapPracticeDemo {
    public static void main(String... args){
        String[] string = "This is is firstline. That second line line .".split(" ");
        System.out.println(string);
        //remove duplicates

        //ordered unique set
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.addAll(Arrays.asList(string));
        System.out.println(linkedHashSet);
        StringBuilder stringBuilder = new StringBuilder();

        for (String item:
            linkedHashSet ) {
            stringBuilder.append(item);
            stringBuilder.append(" ");
        }

        System.out.println(stringBuilder.toString());

    }
}

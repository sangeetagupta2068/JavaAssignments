package com.domain.sangeetagupta.string_applications;

public class StringBuilderBufferDemo {

    public static void main(String... args){
        //same methods in StringBuffer
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println(stringBuilder);
        stringBuilder.append("World");
        System.out.println(stringBuilder);

        //insert in between
        stringBuilder.insert(5,"Hey");
        System.out.println(stringBuilder);

        stringBuilder.replace(5,8,"Hii");
        System.out.println(stringBuilder);

        //remove substring from 7 till 8
        stringBuilder.delete(5,8);
        System.out.println(stringBuilder);

        stringBuilder.reverse();
        System.out.println(stringBuilder);

        System.out.println(stringBuilder.capacity());
        //we can decide our own capacity
        StringBuilder stringBuilder1 = new StringBuilder(50);
        System.out.println(stringBuilder1.capacity());

        String string = stringBuilder.toString();
        System.out.println(string);
    }
}

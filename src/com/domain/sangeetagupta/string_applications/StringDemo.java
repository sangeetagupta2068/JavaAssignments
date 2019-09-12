package com.domain.sangeetagupta.string_applications;

public class StringDemo {

    public StringDemo(String... value){
        for(int count = 0; count<value.length; count++){
            System.out.println(value[count]);
        }
    }

    public static void main(String... args){
        StringDemo stringDemo1 = new StringDemo("Hello","World","Sangee","Example");
        StringDemo stringDemo2 = new StringDemo("Hello","World","Sangee");
    }
}

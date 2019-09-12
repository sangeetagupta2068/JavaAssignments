package com.domain.sangeetagupta.collection_demo;

public class GenericMethodDemo {

    //by default all classes and methods are data type specefic

    //internally compiler will create two methods
    //in case of T x, T y you will have to pass data of same type

    public static<T> void print(T x){
        System.out.println(x);
    }

    //for different type
    public static<T,X> void print(T x, X y){
        System.out.println(x + " " + y);
    }

    //represent primitive data type in the form of Object
    //all collections work on Object and not primitive type
    //Generic is a class/ method which is not data type specific ( MyValue value = ...(Heterogeneous)
    //Using generics we can create a specific datatype object (MyValue<Integer> integer = new MyValue<>()Diamond parameter -> <> (Homogeneous)

    //autoboxing now (boxing and unboxing is now automatic)
    //before 1.5, boxing -> converting primitive to wrapper class object( Integer integer = new Integer(10);
    // unboxing -> wrapper class object to primitive (int val = integer.intValue();)
    //byte - Byte, short - Short, int - Integer, long - Long, float - Float, double - Double, char - Character, boolean - Boolean
    public static void main(String... args){
        print(10);
        print(11.0);
        print(11.0,12);
        print("Sangeeta");
    }
}

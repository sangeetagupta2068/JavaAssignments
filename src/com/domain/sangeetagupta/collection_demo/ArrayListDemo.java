package com.domain.sangeetagupta.collection_demo;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

    //array list classes are generic classes
    public static void main(String... args){
        //ordered heteregenous hai ArrayList
        ArrayList arrayList = new ArrayList();
        arrayList.add("xyz");
        arrayList.add(10);

        System.out.println(arrayList);

        for (Object o:
            arrayList ) {
            System.out.println(o);
        }

        //duplicate and ordered for all child classes of List (Arraylist, linkedlist and vector)
        ArrayList<Integer> arrayList1 = new ArrayList<>();

        //append
        arrayList1.add(1);
        arrayList1.add(2);
        arrayList1.add(3);
        arrayList1.add(5);

        System.out.println(arrayList1);

        //insertion
        arrayList1.add(2,10);
        System.out.println(arrayList1);
        System.out.println("size: " + arrayList1.size());
        System.out.println(" at 1: " + arrayList1.get(1));

        //modify value at given position
        arrayList1.set(1,3);
        System.out.println(arrayList1);

        //removes the first occurrence of that value
        //two types -> value and index
        //preference to index
        //henc we create object of wrapper class
//        arrayList1.remove(new Integer(1));

        Integer i = 1;
        arrayList1.remove(i);
        System.out.println(arrayList1);

        //here index pe delete kar raha hai
        //index will get preference
        arrayList1.remove(2);
        System.out.println(arrayList1);

        //clear(), isEmpty(), contains()

        //traversal using iterator
        Iterator<Integer> integerIterator = arrayList1.iterator();
        while (integerIterator.hasNext()){
            //returns value at that location
            System.out.println(integerIterator.next());
        }
    }
}

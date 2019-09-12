package com.domain.sangeetagupta.collection_demo;

import java.util.HashSet;

public class ProductSetDemo {

    public static void main(String... args){
        Product product1 = new Product(1,"Samsung Galaxy 10",20000f);
        Product product2 = new Product(2,"Samsung Galaxy S",90000f);
        Product product3 = new Product(1,"Samsung Galaxy A series",80000f);
        Product product4 = new Product(1,"Samsung Galaxy A series",80000f);

        //memory address se kar raha hai. Hence for product1 and product4, same values are being stored.
        HashSet<Product> products = new HashSet<>();
        //add() internally calls hashCode() and equals()
        products.add(product1);
        //add() compares hashCode() of product1 and product2, if different, then add
        products.add(product2);
        products.add(product3);

        //implementation Command + Click
        //hashCode() if same, calls equals() method, if same, don't add object.
        products.add(product4);

        System.out.println(product1.hashCode());
        System.out.println(product4.hashCode());

        //hashcode returns the memory address of the object . Hashcode is unique identity of objects
        //after overriding hascode() and equals() method, duplicate values of product nahi le raha

        //contract between hasCode() and equals(). If hashCode is same, it isn't neccessary that equals() will return true.
        //if equals() returns true, then hashCode() must be true.

        System.out.println(products);
    }
}

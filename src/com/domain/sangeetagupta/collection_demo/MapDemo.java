package com.domain.sangeetagupta.collection_demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

//take number from user and show the frequency of the number
public class MapDemo {

    public static void main(String... args) {
        HashMap<Integer,Integer> hashMap = new HashMap<>();
        boolean flag = true;
        Integer key = 0;
        Scanner scanner = new Scanner(System.in);

        while (flag) {
            System.out.println("Enter number");
            key = scanner.nextInt();
            if(hashMap.containsKey(key)){
                hashMap.put(key,hashMap.get(key) + 1);
            } else {
                hashMap.put(key,1);
            }
            System.out.println("Do you wanna add more? Enter true for yes and false for no");
            flag = scanner.nextBoolean();
        }

        System.out.println(hashMap);
    }
}

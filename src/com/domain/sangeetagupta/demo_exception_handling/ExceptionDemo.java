package com.domain.sangeetagupta.demo_exception_handling;

import jdk.internal.cmm.SystemResourcePressureImpl;

import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first num:");
        int num = scanner.nextInt();
        System.out.println("Enter second num:");
        int num2 = scanner.nextInt();
        try {
            System.out.println(num / num2);
            //multi-class exception
        }catch(ArithmeticException|ArrayIndexOutOfBoundsException|NullPointerException exception){
            //production message
            System.out.println("Please enter second number as non zero number");
            //development message
            System.out.println(exception);

        }
    }

}

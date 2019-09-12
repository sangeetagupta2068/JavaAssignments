package com.domain.sangeetagupta;

public class CharacterPrinter {

    public static void print(){
        System.out.print("\n");

        for(int i =0; i<5;i++){
            System.out.print("*");
        }
    }

    public static void print(char value, int count){
       System.out.print("\n");

       for(int i=0; i<count; i++){
            System.out.print(value);
       }
    }

    public static void print(char value, int rowCount, int columnCount){
        for(int i=0; i<rowCount; i++){
            System.out.print("\n");

            for(int j=0; j<columnCount; j++){
                System.out.print(value);
            }
        }
    }
}

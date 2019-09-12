package com.domain.sangeetagupta;

public class TwoDimensionalArrayDemoModel {

    public static void main(String... args){

//        int diffArray[][] = new int[3][];
//        diffArray[0] = new int[3];
//        diffArray[1] = new int[4];
//        diffArray[2] = new int[5];

        int array[][] = new int[3][4];


        for(int i = 0; i<array.length; i++){
            for(int j=0;j<array[i].length;j++){
                System.out.println(array[i][j] + " ");
            }
            System.out.println("\n++");
        }

    }
}

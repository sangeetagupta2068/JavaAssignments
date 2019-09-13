package com.domain.sangeetagupta.algorithm_assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Stack;

public class TravellingSalesmanImplementor {
    private int nodeCount;
    private Stack<Integer> integers;
    private int[][] adjacencyMatrix;
    private int[] visitedNodes;

    public TravellingSalesmanImplementor(int nodeCount,String filePath) throws IOException{
        this.nodeCount = nodeCount;
        adjacencyMatrix = new int[nodeCount][nodeCount];
        initializeAdjacencyMatrix(filePath);

        visitedNodes = new int[nodeCount+1];
        integers = new Stack<>();

    }

    private void initializeAdjacencyMatrix(String filePath)throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int count = 0;
        String distances;

        while ((distances = bufferedReader.readLine())!=null){
            String[] temp = distances.split("  ");
            adjacencyMatrix[count] = Arrays.stream(temp).mapToInt(Integer::valueOf).toArray();
            count = count +1;
        }

        for(int row= 0; row<nodeCount; row++){
            for (int column = 0; column<nodeCount; column++){
                System.out.println(adjacencyMatrix[row][column]);
            }
        }
    }


    public void tsp()
    {
        visitedNodes[1] = 1;
        integers.push(1);
        int element, dst = 0, i;
        int min = Integer.MAX_VALUE;
        boolean minFlag = false;
        System.out.print(1 + "\t");
        while (!integers.isEmpty())
        {
            element = integers.peek();
            i = 1;
            min = Integer.MAX_VALUE;
            while (i <= nodeCount)
            {
                if (adjacencyMatrix[element][i] > 1 && visitedNodes[i] == 0)
                {
                    if (min > adjacencyMatrix[element][i])
                    {
                        min = adjacencyMatrix[element][i];
                        dst = i;
                        minFlag = true;
                    }
                }
                i++;
            }
            if (minFlag)
            {
                visitedNodes[dst] = 1;
                integers.push(dst);
                System.out.print(dst + "\t");
                minFlag = false;
                continue;
            }
            integers.pop();
        }
    }

    public static void main(String... args){
        try {
            TravellingSalesmanImplementor travellingSalesmanImplementor = new TravellingSalesmanImplementor(15,"/Users/sangeetagupta/IdeaProjects/JavaAssignments/src/com/domain/sangeetagupta/algorithm_assignment/tsp.txt");
            travellingSalesmanImplementor.tsp();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

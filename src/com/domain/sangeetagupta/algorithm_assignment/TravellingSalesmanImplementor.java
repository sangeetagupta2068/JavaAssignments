package com.domain.sangeetagupta.algorithm_assignment;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class TravellingSalesmanImplementor {
    private int nodeCount;
    private int[][] adjacencyMatrix;
    private boolean[] flag;
    private int[] visitedNodes;
    private int sum;

    public TravellingSalesmanImplementor(int nodeCount, String filePath) throws IOException {
        this.nodeCount = nodeCount;
        adjacencyMatrix = new int[nodeCount][nodeCount];
        initializeAdjacencyMatrix(filePath);

        visitedNodes = new int[nodeCount];
        flag = new boolean[nodeCount];
        sum = 0;

    }

    private void initializeAdjacencyMatrix(String filePath) throws IOException {
        FileReader fileReader = new FileReader(filePath);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        int count = 0;
        String distances;

        while ((distances = bufferedReader.readLine()) != null) {
            String[] temp = distances.split("  ");
            adjacencyMatrix[count] = Arrays.stream(temp).mapToInt(Integer::valueOf).toArray();
            count = count + 1;
        }
    }


    public void generateMinimumDistanceTour() {
        int minimumDistance = Integer.MAX_VALUE;

        int rowTemp = 0;
        sum = 0;
        int row = 0;
        for (int count = 0; count < nodeCount; count++) {
            minimumDistance = Integer.MAX_VALUE;
            for (int column = 0; column < nodeCount; column++) {
                if (column == row || flag[column]) {
                    continue;
                }
                if (adjacencyMatrix[row][column] < minimumDistance) {
                    minimumDistance = adjacencyMatrix[row][column];
                    rowTemp = column;

                }
            }
            visitedNodes[row] = rowTemp;
            flag[rowTemp] = true;
            row = rowTemp;
            sum = sum + minimumDistance;
        }

        sum = sum + adjacencyMatrix[row][0];

        System.out.println(sum);

    }

    public void displayPath() {
        System.out.print((adjacencyMatrix[0][0]+1)+ "->");
        for (int node : visitedNodes) {
            System.out.print(node + 1 + "->");
        }
        System.out.print(adjacencyMatrix[0][0]+1 + "\n");
    }

    public void displayTotalMinimumDistance() {
        System.out.println("Sum is: " + sum);
    }

    public static void main(String... args) {
        try {
            TravellingSalesmanImplementor travellingSalesmanImplementor = new TravellingSalesmanImplementor(15, "/Users/sangeetagupta/IdeaProjects/JavaAssignments/src/com/domain/sangeetagupta/algorithm_assignment/tsp.txt");
            travellingSalesmanImplementor.generateMinimumDistanceTour();
            travellingSalesmanImplementor.displayPath();
            travellingSalesmanImplementor.displayTotalMinimumDistance();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

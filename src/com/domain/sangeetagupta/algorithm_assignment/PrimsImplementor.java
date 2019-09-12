package com.domain.sangeetagupta.algorithm_assignment;


import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;

import javafx.util.Pair;

public class PrimsImplementor {
    private int graphSize;
    private LinkedList<Edge>[] adjacencylist;
    private boolean[] mst;
    private Node[] nodes;
    private int[] key;
    private PriorityQueue<Pair<Integer, Integer>> priorityQueue;

    public PrimsImplementor(int graphSize) {
        this.graphSize = graphSize;
        adjacencylist = new LinkedList[graphSize];
        //initialize adjacency lists for all the vertices
        for (int count = 0; count < graphSize; count++) {
            adjacencylist[count] = new LinkedList<Edge>();
        }
        mst = new boolean[graphSize];
        nodes = new Node[graphSize];
        //keys used for checking if priority queue updation is required
        key = new int[graphSize];


        for (int i = 0; i < graphSize; i++) {
            //initialize all the keys to infinity
            key[i] = Integer.MAX_VALUE;
            //initialize nodes for all the vertices
            nodes[i] = new Node();
        }

        //Initialize priority queue
        priorityQueue = new PriorityQueue<>(graphSize, new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> p1, Pair<Integer, Integer> p2) {
                //sort using key values
                int key1 = p1.getKey();
                int key2 = p2.getKey();
                return key1 - key2;
            }
        });

        key[0] = 0;
        Pair<Integer, Integer> pair = new Pair<>(key[0], 0);
        priorityQueue.offer(pair);

    }

    public void addEgde(int source, int destination, int weight) {
        Edge edge = new Edge(source, destination, weight);
        adjacencylist[source].addFirst(edge);

        //for undirected graph
        edge = new Edge(destination, source, weight);
        adjacencylist[destination].addFirst(edge);
    }

    public void generateMinimumSpanningTree() {

        nodes[0] = new Node();
        nodes[0].setVertex(-1);

        while (!priorityQueue.isEmpty()) {
            Pair<Integer, Integer> extractedPair = priorityQueue.poll();
            int extractedVertex = extractedPair.getValue();
            mst[extractedVertex] = true;

            //iterate through all the adjacent vertices and update the keys
            LinkedList<Edge> list = adjacencylist[extractedVertex];
            for (int count = 0; count < list.size(); count++) {
                Edge edge = list.get(count);
                if (!mst[edge.getDestination()]) {
                    int destination = edge.getDestination();
                    int newKey = edge.getWeight();

                    if (key[destination] > newKey) {
                        Pair<Integer, Integer> pair = new Pair<>(newKey, destination);
                        priorityQueue.offer(pair);
                        nodes[destination].setVertex(extractedVertex);
                        nodes[destination].setCost(newKey);
                        key[destination] = newKey;
                    }

                }
            }
        }

    }

    public void display() {
        int totalMinWeight = 0;
        System.out.println("Minimum Spanning Tree: ");
        for (int count = 1; count < graphSize; count++) {
            System.out.println("Edge: " + count + " - " + nodes[count].getVertex() +
                    " key: " + nodes[count].getCost());
            totalMinWeight += nodes[count].getCost();
        }
        System.out.println("Total minimum key: " + totalMinWeight);
    }
}


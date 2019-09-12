package com.domain.sangeetagupta.algorithm_assignment;

import java.util.*;

public class DijkstraImplementor {
    //data member declaration
    private int[] distances;
    private HashSet<Integer> shortestPathSet;
    private PriorityQueue<Node> priorityQueue;
    private List<List<Node>> adjacencyList;
    private int size;
    private int source;

    //default constructor
    public DijkstraImplementor(){}

    //initialization
    public DijkstraImplementor(int size) {
        this.size = size;
        distances = new int[size];
        shortestPathSet = new HashSet<>();
        priorityQueue = new PriorityQueue<>(size, new Node());
        adjacencyList = new ArrayList<List<Node>>();

        for (int count = 0; count < size; count++) {
            List<Node> list = new ArrayList<Node>();
            adjacencyList.add(list);
        }
    }

    //add node to graph
    public void addNode(int position, Node node) {
        adjacencyList.get(position).add(node);
    }

    //implementation of dijkstra's algorithim
    public void calculateAllShortestPath(int source) {
        for (int count = 0; count < size; count++) {
            distances[count] = Integer.MAX_VALUE;
        }

        priorityQueue.add(new Node(source, 0));
        distances[source] = 0;

        while (shortestPathSet.size() != size) {
            int vertex = priorityQueue.remove().getVertex();
            shortestPathSet.add(vertex);
            getNeighbourForSource(vertex);
        }
    }

    //find node with minimum cost for given node
    private void getNeighbourForSource(int vertex) {
        int edge = -1;
        int distance = -1;
        this.source = vertex;

        for (int count = 0; count < adjacencyList.get(vertex).size(); count++) {
            Node node = adjacencyList.get(vertex).get(count);

            if (!shortestPathSet.contains(node.getVertex())) {
                edge = node.getCost();
                distance = distances[vertex] + edge;

                if (distance < distances[node.getVertex()]) {
                    distances[node.getVertex()] = distance;
                }

                priorityQueue.add(new Node(node.getVertex(), distances[node.getVertex()]));
            }
        }
    }

    //display computed shortest distance from source to all other nodes
    public void display(){
        for(int count = 0; count < distances.length; count++){
            System.out.println("Shortest distance from source: " + source + " to " + count + " :" + distances[count]);
        }
    }

}

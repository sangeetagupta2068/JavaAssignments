package com.domain.sangeetagupta.algorithm_assignment;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class KrushkalImplementor {
    private int graphSize;
    private List<Edge> edges;
    private int[] parent;
    private ArrayList<Edge> minimumSpanningTree;

    public KrushkalImplementor(int graphSize) {
        this.graphSize = graphSize;
        edges = new ArrayList<Edge>();
        parent = new int[graphSize];
        minimumSpanningTree = new ArrayList<>();
    }

    public void addEgde(int source, int destination, int weight) {
        Edge edge = new Edge(source, destination, weight);
        edges.add(edge);
    }


    public void generateMinimumSpanningTree() {
        PriorityQueue<Edge> priorityQueue = new PriorityQueue<>(edges.size(), Comparator.comparingInt(o -> o.getWeight()));
        priorityQueue.addAll(edges);
        makeSet();

        for (int index = 0; index < graphSize - 1; ) {
            Edge edge = priorityQueue.remove();
            int source = find(edge.getSource());
            int destination = find(edge.getDestination());

            if (source != destination) {
                minimumSpanningTree.add(edge);
                index++;
                union(source, destination);
            }
        }
    }

    private void makeSet() {
        for (int count = 0; count < graphSize; count++) {
            parent[count] = count;
        }
    }

    private int find(int vertex) {
        if (parent[vertex] != vertex)
            return find(parent[vertex]);
        ;
        return vertex;
    }

    private void union(int source, int destination) {
        int sourceParent = find(source);
        int destinationParent = find(destination);
        parent[destinationParent] = sourceParent;
    }

    public void display() {
        for (int i = 0; i < minimumSpanningTree.size(); i++) {
            Edge edge = minimumSpanningTree.get(i);
            System.out.println("Edge-" + i + " source: " + edge.getSource() +
                    " destination: " + edge.getDestination() +
                    " weight: " + edge.getWeight());
        }
    }

}
package com.domain.sangeetagupta.algorithm_assignment;

import java.util.Comparator;

public class Node implements Comparator<Node> {

    private int vertex;
    private int cost;

    public Node(){}

    public Node(int vertex,int cost){
        this.vertex = vertex;
        this.cost = cost;
    }
    @Override
    public int compare(Node source, Node destination) {
        int flag = 0;
        if(source.getCost() < destination.getCost())
            flag = -1;
        else if(source.getCost()>destination.getCost())
            flag = 1;
        return flag;
    }

    public int getVertex() {
        return vertex;
    }

    public void setVertex(int vertex) {
        this.vertex = vertex;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
}

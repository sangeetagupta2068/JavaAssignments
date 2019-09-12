package com.domain.sangeetagupta.algorithm_assignment;

public class AlgoDemo {
    public static void main(String... args){

        //test for dijkstra's algorithm API
        DijkstraImplementor graph = new DijkstraImplementor(5);
        graph.addNode(0,new Node(1, 9));
        graph.addNode(0,new Node(2, 6));
        graph.addNode(0,new Node(3, 5));
        graph.addNode(0,new Node(4, 3));

        graph.addNode(2,new Node(1, 2));
        graph.addNode(2,new Node(3, 4));

        graph.calculateAllShortestPath(0);
        graph.display();

        //test for prim's algorithm API
        PrimsImplementor primsImplementor = new PrimsImplementor(6);
        primsImplementor.addEgde(0, 1, 4);
        primsImplementor.addEgde(0, 2, 3);
        primsImplementor.addEgde(1, 2, 1);
        primsImplementor.addEgde(1, 3, 2);
        primsImplementor.addEgde(2, 3, 4);
        primsImplementor.addEgde(3, 4, 2);
        primsImplementor.addEgde(4, 5, 6);

        primsImplementor.generateMinimumSpanningTree();
        primsImplementor.display();

        //test for krushkal's algorithm API
        KrushkalImplementor krushkalImplementor = new KrushkalImplementor(6);
        krushkalImplementor.addEgde(0, 1, 4);
        krushkalImplementor.addEgde(0, 2, 3);
        krushkalImplementor.addEgde(1, 2, 1);
        krushkalImplementor.addEgde(1, 3, 2);
        krushkalImplementor.addEgde(2, 3, 4);
        krushkalImplementor.addEgde(3, 4, 2);
        krushkalImplementor.addEgde(4, 5, 6);

        krushkalImplementor.generateMinimumSpanningTree();
        krushkalImplementor.display();
    }
}

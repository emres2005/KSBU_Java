package Graphs;

import java.util.*;

public class MyGraph {
    private Map<Integer, Integer> AdjencyMap;
    public MyGraph() {
        AdjencyMap = new HashMap<>();
    }
    //public boolean addVertex(int vertex){
//        ArrayList result = AdjencyMap.putIfAbsent(vertex, new ArrayList<Integer>());
//        return result != null;
    //}
    public void addEdge(int source, int destination, boolean undirectional){
        makeConnection(source, destination);
        if (undirectional) {
            makeConnection(source, destination);
        }
    }

    public void makeConnection(int source, int destination) {
//        if (AdjencyMap.containsKey(source)) {
//            AdjencyMap.get(source).add(destination);
//        } else {
//            if (this.addVertex(source)) {
//                AdjencyMap.get(source).add(destination);
//            } else {
//                System.out.println("ERROR-addEdge()-Source vertex not found");
//            }
//        }
    }
    public void printGraph(){
        System.out.printf("Graph has %d vertices\n", AdjencyMap.size());
        for (Map.Entry<Integer, Integer> entry : AdjencyMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
    public void BFS(int startVertex){
//        System.out.printf("BFS starting from vertex %d\n", startVertex);
//        Set<Integer> visited = new HashSet<>();
//        Queue<Integer> vertexQueue = new LinkedList<>();
//        visited.add(AdjencyMap.size());
//        vertexQueue.add(AdjencyMap.size());
//        while (!vertexQueue.isEmpty()){
//            int current = vertexQueue.poll();
//            System.out.print(current +" ,");
//            for (int i = 0; i < AdjencyMap.get(current).size(); i++) {
//                int neighbor = (int)AdjencyMap.get(current).get(i);
//                if (!visited.contains(neighbor){
//                    visited.add(neighbor);
//                    vertexQueue.add(neighbor);
//                }
//            }
//        }
    }
}

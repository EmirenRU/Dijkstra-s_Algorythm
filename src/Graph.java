
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;

public class Graph {
    static private int V;
    static private ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

    public Graph(int v){ V = v;}
    public void addNodes(ArrayList<Integer> arr){
        adj.add(arr);
    }
    public static void setV(int v) { V = v; }
    public static int getV() { return V; }

    public static ArrayList<ArrayList<Integer>> getAdj() { return adj; }
    public void ShortestPath(int src) {
        ArrayList<Integer> dist = new ArrayList<>();
        Boolean[] sptSet = new Boolean[V];

        for (int i = 0; i < V; i++){
            dist.add(Integer.MAX_VALUE);
            sptSet[i] = false;
        }

        dist.set(src, 0);

        for (int count = 0; count < V - 1; count++ ) {

            int index = minDistance(dist, sptSet);

            sptSet[index] = true;

            for (int v = 0; v < V; v++) {

                if (!sptSet[v] && (adj.get(index).get(v) != 0) && (dist.get(index) != Integer.MAX_VALUE)
                        && (dist.get(index) + adj.get(index).get(v) < dist.get(v))){
                    dist.set(v, dist.get(index) + adj.get(index).get(v));
                }

            }
        }

        printResult(dist, src);

    }

    private int minDistance(ArrayList<Integer> dist, Boolean[] sptSet){

        int min = Integer.MAX_VALUE, min_index = -1;

        for (int i = 0; i < V; i++){
            if (!sptSet[i] && dist.get(i) <= min){
                min = dist.get(i);
                min_index = i;
            }
        }

        return min_index;
    }

    private void printResult(ArrayList<Integer> dist, int src){
        System.out.println("\nShortest path from " + ++src + " to ");

        for (int i = 0; i < V; i++){
            System.out.println(i+1 + "\t\t" + dist.get(i) + "\t\t");
        }
    }


}

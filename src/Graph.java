
import java.util.*;

public class Graph {
    static private int V;
    static private ArrayList<ArrayList<Integer>> adj;
    static private Set<Integer> set;

    public Graph(int v){ V = v; adj = new ArrayList<>(v-1);}

    public static void setV(int v) {
        V = v;
    }
    public static int getV() {
        return V;
    }

    public void addNodes(ArrayList<Integer> arr){
        adj.add(arr);
    }

//    public Set<Integer> Dijkstra(){
//
//    }

}

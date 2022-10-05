
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;

public class Graph {
    static private int V;
    static private Vector<Vector<Integer>> adjVec;
    static private Set<Set<Integer>> adjSet;

    public Graph(int V){ this.V = V; adjVec = new Vector<>(this.V) ; for (var i : adjVec) { i = new Vector<>(this.V); }}

    public static void setV(int v) {
        V = v;
    }

    public static void setNode (int V, int VV){

        // O(n^2)
        Iterator<Set<Integer>> iter = adjSet.stream().iterator();
        int i = 0;
        while ( i++ != V ){
            iter.next();


        }
    }

    public static int getV() {
        return V;
    }

    public void Dijkstra(){}

}

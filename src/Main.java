import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

public class Main {
    //static Scanner s = new Scanner(System.in);
    static Graph graph;
    static ArrayList<Integer> arr;
    public static void main(String[] args){
        // 0 1 2 3 4
        // A B C D E
        arr = new ArrayList<>(5);
        graph = new Graph(5);

        // A
        arr.add(0);
        arr.add(50);
        arr.add(0);
        arr.add(0);
        arr.add(90);

        graph.addNodes(arr);
        arr.clear();

        // B
        arr.add(50);
        arr.add(0);
        arr.add(90);
        arr.add(0);
        arr.add(0);
        graph.addNodes(arr);
        arr.clear();

        // C
        arr.add(0);
        arr.add(90);
        arr.add(0);
        arr.add(80);
        arr.add(60);
        graph.addNodes(arr);
        arr.clear();

        // D
        arr.add(0);
        arr.add(0);
        arr.add(80);
        arr.add(0);
        arr.add(70);
        graph.addNodes(arr);
        arr.clear();

        // E
        arr.add(90);
        arr.add(0);
        arr.add(60);
        arr.add(70);
        arr.add(0);
        graph.addNodes(arr);

//        Set<Integer> res = graph.Dijkstra();

    }

    protected void finalize(){
        // s.close();
    }
}

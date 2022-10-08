import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Set;

public class Main {
    //static Scanner s = new Scanner(System.in);
    static Graph graph;
    static ArrayList<Integer> arr;
    public static void main(String[] args){

        arr = new ArrayList<>(16);
        graph = new Graph(16);

        // v1
        arr = makeList(new int[]{0,  3,  0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0});
        graph.addNodes(arr);

        // v2
        arr = makeList(new int[]{0, 0, 10, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        graph.addNodes(arr);

        // v3
        arr = makeList(new int[]{0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0});
        graph.addNodes(arr);

        // v4
        arr = makeList(new int[]{0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        graph.addNodes(arr);

        // v5
        arr = makeList(new int[]{0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3});
        graph.addNodes(arr);

        // v6
        arr = makeList(new int[]{0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        graph.addNodes(arr);

        // v7
        arr = makeList(new int[]{0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 3, 0, 0});
        graph.addNodes(arr);

        // v8
        arr = makeList(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 7, 0, 0, 0});
        graph.addNodes(arr);

        // v9
        arr = makeList(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0});
        graph.addNodes(arr);

        // v10
        arr = makeList(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        graph.addNodes(arr);

        // v11
        arr = makeList(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 9});
        graph.addNodes(arr);

        // v12
        arr = makeList(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0});
        graph.addNodes(arr);

        // v13
        arr = makeList(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0});
        graph.addNodes(arr);

        // v14
        arr = makeList(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 1, 0});
        graph.addNodes(arr);

        // v15
        arr = makeList(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0});
        graph.addNodes(arr);

        // v16
        arr = makeList(new int[]{0, 0, 0, 0, 0, 0, 7, 2, 3, 0, 0, 0, 0, 0, 0, 0});
        graph.addNodes(arr);


//        Set<Integer> res = graph.Dijkstra();

    }

    public static ArrayList<Integer> makeList(int[] arr){
        ArrayList<Integer> arrayList = new ArrayList<>(16);

        Arrays.stream(arr).forEach(arrayList::add);

        Arrays.stream(arr).forEach(i -> i = 0);

        return arrayList;
    }


    protected void finalize(){
        // s.close();
    }
}

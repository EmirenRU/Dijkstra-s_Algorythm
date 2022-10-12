import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Dijkstra {
    static Graph graph = new Graph(16);
    static ArrayList<Integer> arr = new ArrayList<>(16);
    static Scanner scan = new Scanner(System.in);
    static Thread t = Thread.currentThread();


    public void run() throws InterruptedException {
        addGraph();

        System.out.print("From which vertices you want to start? \n" +
                "Write number: ");
        int choice = scan.nextInt();

        graph.ShortestPath(choice-1);

//        for (int i = 0; i < 16; i++) {
//            graph.ShortestPath(i);
//            t.sleep(2500);
//        }

        scan.close();
    }



    public static void addGraph(){
        // v1
        graph.addNodes(makeList(new int[]{0,  3,  0, 0, 0, 0, 0, 0, 0, 0, 0, 2, 0, 0, 0, 0}));

        // v2
        graph.addNodes(makeList(new int[]{0, 0, 10, 6, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));

        // v3
        graph.addNodes(makeList(new int[]{0, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 5, 0, 0, 0, 0}));

        // v4
        graph.addNodes(makeList(new int[]{0, 0, 0, 0, 2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));

        // v5
        graph.addNodes(makeList(new int[]{0, 0, 0, 0, 0, 4, 0, 0, 0, 0, 0, 0, 0, 0, 0, 3}));

        // v6
        graph.addNodes(makeList(new int[]{0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 0, 0, 0, 0}));

        // v7
        graph.addNodes(makeList(new int[]{0, 0, 0, 0, 0, 0, 0, 3, 0, 0, 0, 0, 0, 3, 0, 0}));

        // v8
        graph.addNodes(makeList(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 4, 0, 0, 0, 7, 0, 0, 0}));

        // v9
        graph.addNodes(makeList(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 0, 0, 0, 0}));

        // v10
        graph.addNodes(makeList(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));

        // v11

        graph.addNodes(makeList(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 8, 0, 0, 0, 0, 0, 9}));

        // v12
        graph.addNodes(makeList(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0}));

        // v13
        graph.addNodes(makeList(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}));

        // v14
        graph.addNodes(makeList(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 1, 0}));

        // v15
        graph.addNodes(makeList(new int[]{0, 0, 0, 0, 0, 0, 0, 0, 20, 0, 0, 0, 0, 0, 0, 0}));

        // v16
        graph.addNodes(makeList(new int[]{0, 0, 0, 0, 0, 0, 7, 2, 3, 0, 0, 0, 0, 0, 0, 0}));

    }

    public static ArrayList<Integer> makeList(int[] arr){
        ArrayList<Integer> arrayList = new ArrayList<>(16);

        Arrays.stream(arr).forEach(arrayList::add);

        return arrayList;
    }
}

package javase.lesson8.homework;


import javase.lesson8.Graph;

public class Main1 {
    public static void main(String[] args) {
        EdgeGraph[] arr = new EdgeGraph[4];
        EdgeGraph graph1 = new EdgeGraph(0, 1);
        EdgeGraph graph2 = new EdgeGraph(1, 2);
        EdgeGraph graph3 = new EdgeGraph(2, 3);
        EdgeGraph graph4 = new EdgeGraph(2, 4);
        arr[0] = graph1;
        arr[1] = graph2;
        arr[2] = graph3;
        arr[3] = graph4;
        Graph1 graph = new Graph1(arr);
        graph.printG();
        System.out.println("Обход в глубину");
        graph.deepBypass(0, 5);
        System.out.println("Обход в ширину");
        graph.wideBypass(0, 5);
    }
}

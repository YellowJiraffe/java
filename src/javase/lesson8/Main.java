package javase.lesson8;


public class Main {
    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 1, 0, 0, 0},
                {1, 0, 0, 0, 0, 0},
                {1, 0, 0, 1, 1, 0},
                {0, 0, 1, 0, 0, 1},
                {0, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 0, 0}
        };

        Graph graph = new Graph(matrix);

        System.out.println("Обход в глубину");
        graph.deepBypass(0);

        System.out.println("Обход в ширину");
        graph.wideBypass(0);
    }
}

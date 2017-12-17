package javase.lesson3.homework.add;

/*ArraysWithDifferentSizes
 */
public class task2second {public static void main(String[] args) {
    int[] a1 = {1, 2, 3};
    int[] a2 = {1, 5};
    int[] a3 = {6, 2, 3, 5, 1};


    int[][] matrix = {a1, a2, a3};

    int[][] matrix2 = {
            {1, 2, 3},
            {5, 1},
            {7},
            {101, 232}
    };

    task2.printMatrix(matrix);
    System.out.println();
    task2.printMatrix(matrix2);
}
}

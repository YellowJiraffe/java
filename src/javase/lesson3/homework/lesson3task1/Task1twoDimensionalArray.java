package javase.lesson3.homework.lesson3task1;

/** Написать метод, принимающий int N, и возвращающий матрицу размером N на N следующего вида:

1 1 1 1 ... 1 1
0 0 0 0 ... 0 0
1 1 1 1 ... 1 1
0 0 0 0 ... 0 0
...............
 */
public class Task1twoDimensionalArray {
    public static void main(String[] args) {
        //example with foreach
        int[] testArray = {1, 2, 3, 4};
        for (int i = 0; i < testArray.length; i++) {
            int currentElement = testArray[i];
            System.out.println(currentElement);
        }

        for(int currentElement : testArray) {
            System.out.println(currentElement);
        }

        //////////////////////////////////////


        int[][] matrix = getN(5);
        printMatrix(matrix);

    }

    public static int[][] getN(int n) {
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i % 2 == 0) {
                    matrix[i][j] = 1;

                }
            }
        }
        return matrix;
    }

    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}


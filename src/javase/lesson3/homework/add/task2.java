package javase.lesson3.homework.add;

/*Получить матрицу: 1 по диагонали, остальные 0.
 */
public class task2 {public static void main(String[] args) {
    int n = 5;

    int[][] matrix = new int[n][n];


    printMatrix(matrix);

    for (int i = 0; i < n; i++) {
        for (int j = 0; j < n; j++) {

            if (i == j) {
                matrix[i][j] = 1;
            }

            if (i + j == n - 1) {
                matrix[i][j] = 1;
            }
        }
    }

    System.out.println();

    printMatrix(matrix);

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

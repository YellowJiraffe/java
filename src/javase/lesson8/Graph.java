package javase.lesson8;
import javase.lesson6.homework.object_queue.ObjectQueue;
import javase.lesson6.homework.object_queue.QueueTest;
public class Graph {
    private int[][] matrix;

    public Graph(int n) {
        matrix = new int[n][n];
    }

    public Graph(int[][] m) {
        matrix = m;
    }

    public void deepBypass(int startPeakIndex) {
        int[] peaks = new int[matrix.length];
        deepBypassHelper(startPeakIndex, peaks);
        System.out.println();
    }

    private void deepBypassHelper(int currentPeakIndex, int[] visitedPeaks) {
        visitedPeaks[currentPeakIndex] = 1;
        System.out.print(currentPeakIndex + " ");
        for(int i = 0; i < matrix.length; i++) {
            if (matrix[currentPeakIndex][i] == 1 && visitedPeaks[i] == 0) {
                deepBypassHelper(i, visitedPeaks);
            }
        }
    }

    public void wideBypass(int startPeakIndex) {
        int[] peaksInQueue = new int[matrix.length];
        ObjectQueue queue = new ObjectQueue();
        queue.push(startPeakIndex);
        peaksInQueue[startPeakIndex] = 1;
        wideBypassHelper(queue, peaksInQueue);
        System.out.println();
    }

    private void wideBypassHelper(ObjectQueue queue, int[] peaksInQueue) {
        int currentPeakIndex = queue.pop().value;
        System.out.print(currentPeakIndex + " ");

        for(int i = 0; i < matrix.length; i++) {
            if (matrix[currentPeakIndex][i] == 1 && peaksInQueue[i] == 0) {
                queue.push(i);
                peaksInQueue[i] = 1;
            }
        }
//        if (!queue.isEmpty()) {
//            wideBypassHelper(queue, peaksInQueue);
//        }
    }
}

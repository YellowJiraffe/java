package javase.lesson8.homework;


import javase.lesson6.homework.object_queue.ObjectQueue;

public class Graph1 {
    private EdgeGraph[] array;

    public Graph1(EdgeGraph[] arr) {
        array = arr;
    }

    public void printG() {
        for (EdgeGraph i : array) {
            System.out.println(i);

        }
        System.out.println();
    }

    public void deepBypass(int startPeakIndex, int peaksAmount) {
        int[] peaks = new int[peaksAmount];
        deepBypassHelper(startPeakIndex, peaks);
        System.out.println();
    }

    private void deepBypassHelper(int currentPeakIndex, int[] visitedPeaks) {
        visitedPeaks[currentPeakIndex] = 1;
        System.out.print(currentPeakIndex + " ");
        for (EdgeGraph edge : array) {
            if (currentPeakIndex == edge.a && visitedPeaks[edge.b] == 0) {
                deepBypassHelper(edge.b, visitedPeaks);
            }
            if (currentPeakIndex == edge.b && visitedPeaks[edge.a] == 0) {
                deepBypassHelper(edge.a, visitedPeaks);
            }

        }
    }

    public void wideBypass(int startPeakIndex, int peaksAmount) {
        int[] peaksInQueue = new int[peaksAmount];
        ObjectQueue queue = new ObjectQueue();
        queue.push(startPeakIndex);
        peaksInQueue[startPeakIndex] = 1;
        wideBypassHelper(queue, peaksInQueue);
        System.out.println();
    }

    private void wideBypassHelper(ObjectQueue queue, int[] peaksInQueue) {
        int currentPeakIndex = queue.pop().value;
        System.out.print(currentPeakIndex + " ");

        for (EdgeGraph edge : array) {
            if (currentPeakIndex == edge.a && peaksInQueue[edge.b] == 0) {
                queue.push(edge.b);
                peaksInQueue[edge.b] = 1;
            }
            if (currentPeakIndex == edge.b && peaksInQueue[edge.a] == 0) {
                queue.push(edge.a);
                peaksInQueue[edge.a] = 1;
            }
        }

        if (!queue.isEmpty()) {
            wideBypassHelper(queue, peaksInQueue);
        }
    }
}






package javase.lesson1.homework;

class Task2Solution {
    public static void main(String args[]) {
        System.out.println("Solution 1");
        firstResolution(0.2);
        System.out.println("Solution 2");
        secondResolution(0.2);
        System.exit(1);
    }
    public static void firstResolution(double eps) {
        int i = 1;
        double a = (1 / (((double) i + 1) * (i + 1)));

        while (a >= eps) {
            System.out.println(a);
            i++;
            a = (1 / (((double) i + 1) * (i + 1)));
        }
        System.out.println(i);
    }
    public static void secondResolution(double eps) {
        for (int i = 1; ; i++) {

            double a = (1 / (((double) i + 1) * (i + 1)));
            if (a < eps) {
                System.out.println(i);
                break;
            }
            System.out.println(a);
        }
    }
}
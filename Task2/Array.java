package Task2;

public class Array {
    public static void bubbleSort(int[] data) {
        int N = data.length;
        for (int K = 0; K < N - 1; K++) {
            for (int PTR = 0; PTR < N - K - 1; PTR++) {
                if (data[PTR] > data[PTR + 1]) {
                    int temp = data[PTR];
                    data[PTR] = data[PTR + 1];
                    data[PTR + 1] = temp;
                }
            }
        }
    }
}

package BubbleSort;

public class Main {
    public static void main(String[] args) {
        int[] data = {5, 2, 9, 1, 5, 6};
        BubbleSort s1 = new BubbleSort();

        System.out.println("Original Array:");
        for (int num : data) {
            System.out.print(num + " ");
        }
        System.out.println();

        s1.bubbleSort(data);

        System.out.println("Sorted Array:");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}

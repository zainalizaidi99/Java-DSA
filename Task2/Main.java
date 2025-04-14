package Task2;

public class Main {
    public static void main(String[] args) {
        int[] data = {5, 2, 9, 1, 4, 6, 3, 7, 10, 8};
        Array s1 = new Array();

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
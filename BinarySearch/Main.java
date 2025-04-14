package BinarySearch;

public class Main {
    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        BinarySearch s1 = new BinarySearch();
        int itemToSearch = 23;
        int location = s1.binarySearch(sortedArray, itemToSearch);

        if (location != -1) {
            System.out.println("ITEM " + itemToSearch + " found at index: " + location);
        } else {
            System.out.println("ITEM " + itemToSearch + " not found in the array.");
        }
    }
}
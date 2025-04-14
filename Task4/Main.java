package Task4;

public class Main {
    public static void main(String[] args) {
        int[] sortedArray = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        Array s1 = new Array();
        int itemToSearch = 56;
        int location = s1.binarySearch(sortedArray, itemToSearch);

        if (location != -1) {
            System.out.println("ITEM " + itemToSearch + " found at index: " + location);
        } else {
            System.out.println("ITEM " + itemToSearch + " not found in the array.");
        }
    }
}

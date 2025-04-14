package BinarySearch;

public class BinarySearch {

    public static int binarySearch(int[] binArray, int item) {
        int beg = 0;
        int end = binArray.length - 1;
        int mid;
        int itLoc = -1;

        while (beg <= end) {
            mid = (beg + end) / 2;

            if (item < binArray[mid]) {
                end = mid - 1;
            } else if (item > binArray[mid]) {
                beg = mid + 1;
            } else if (item == binArray[mid]) {
                itLoc = mid;
                return itLoc;
            }
        }
        return itLoc;
    }
}
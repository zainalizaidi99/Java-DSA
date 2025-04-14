package SelectionSort;

public class Main {
    public static void main(String[] args) {
        int data[] = {29,10,14,37,13};
        SelectionSort s1 = new SelectionSort();
        System.out.println("Array before sorting: ");
        s1.printarray(data);
        s1.selectsort(data);
        System.out.println("Array after sorting: ");
        s1.printarray(data);
    }
}

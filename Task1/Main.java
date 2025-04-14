package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int list[] = new int[5];
        System.out.println("Enter 5 integers: ");
        for(int i=0; i<list.length; i++){
            list[i] = sc.nextInt();
        }
        Array s1 = new Array();
        System.out.println("Array before sorting: ");
        s1.printarray(list);
        s1.selectsort(list);
        System.out.println("Array after sorting: ");
        s1.printarray(list);
    }
}

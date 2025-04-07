package task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Array a1 = new Array();
        int a[] = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<=9; i++){
            a[i] = sc.nextInt();
        }
        a1.Traverse(a);
        a1.Insertion(a, 9, 67);
        a1.Insertion(a, 4, 78);
        a1.Deletion(a, 6, 0);
        int search = a1.search(a, 9, 0);
        System.out.println(search);
    }
}
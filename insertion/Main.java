package insertion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinearArray a1 = new LinearArray();
        int a[] = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<=4; i++){
            a[i] = sc.nextInt();
        }
        a1.Traverse(a);
        a1.Insertion(a, 5, 6);
        a1.Deletion(a, 5, 0);
        int search = a1.search(a, 5, 3);
        System.out.println(search);
    }
}

package task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SumMean a1 = new SumMean();
        int a[] = new int[20];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of array: ");
        for(int i=0; i<=6; i++){
            a[i] = sc.nextInt();
        }
        a1.SumMean(a);
    }
}

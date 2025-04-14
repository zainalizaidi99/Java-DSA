package SelectionSort;

public class SelectionSort {
    void selectsort(int list[]){
        int N = list.length;

        for (int i=0; i<N; i++){
            int min=i;
            for(int j=i+1 ;j<N; j++){
                if(list[j]<list[min]){
                    min = j;
                }
            }
            int temp = list[i];
            list[i] = list[min];
            list[min] = temp;
        }
    }
    void printarray(int list[]){
        for(int value : list){
            System.out.println(value + " ");
        }
        System.out.println();
    }
}

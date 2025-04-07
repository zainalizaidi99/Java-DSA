package insertion;

public class LinearArray {
    void Traverse(int a[]){
        System.out.println("Elements of Array Are: ");
        for(int i=0; i<=4; i++){
            System.out.println(a[i]);
        }
    }

    void Insertion(int a[], int k, int Item){
        int j=k;
        while (j>=k) {
            a[j+1]=a[j];
            j=j-1;
        }
        a[k]=Item;
        System.out.println("Array after insertion: ");
        for(int i=0; i<=5; i++){
            System.out.println(a[i]);
        }

    }
    void Deletion(int a[], int k, int Item){
        int j=k;
        while (j>=k) {
            a[j]=a[j+1];
            j=j-1;
        }
        a[k]=Item;
        System.out.println("Array after deletion: ");
        for(int i=0; i<=5; i++){
            System.out.println(a[i]);
        }
    }
    int search(int arr[] ,int k, int item ){
        int loc = 0 ;
        while (loc<=k){
            if( arr[loc] == item ){
                return loc ;
            }
            else{
                loc = loc +1 ;
            }
        }
        loc = -1 ;
        return loc ;
    }
}

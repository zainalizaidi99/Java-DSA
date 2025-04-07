package task2;

public class SumMean {
    void SumMean(int a[]){
        int sum =0;
        for(int i=0; i<=6; i++){
            sum += i ;
        }
        System.out.println("Sum is: "+sum);
        int length = 7;
        double mean = sum / length;
        System.out.println("Mean of elememts is: "+mean);
    }
}

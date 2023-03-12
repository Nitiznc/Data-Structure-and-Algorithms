import java.util.*;

public class MyClass{
    public static void main(String[] args){
        int[] arr = {9,8,3,5,7,4,2,1,6};
        int n = arr.length;
        int i = 0;
        insertionSort(arr, i, n);
        System.out.println(Arrays.toString(arr));
    }
    private static void insertionSort(int[] arr, int i, int n){
        
        if(i>=n-1){
            return;
        }
        
        for(int j = i+1; j>0; j--){
            if(arr[j]<arr[j-1]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
            }
        }
        insertionSort(arr, ++i, n);
    }
    
}

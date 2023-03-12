import java.util.*;

public class MyClass{
    public static void main(String[] args){
        int[] arr = {9,8,3,5,7,4,2,1,6};
        int n = arr.length;
        int i = 0;
        selectionSort(arr, i, n);
        System.out.println(Arrays.toString(arr));
    }
    private static void selectionSort(int[] arr, int i, int n){
        if(i>=n){
            return;
        }
        for(int j = i+1; j<n; j++){
            if(arr[i]>arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }    
        selectionSort(arr, ++i, n);
    }
}

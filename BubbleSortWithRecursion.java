import java.util.*;

public class MyClass{
    public static void main(String[] args){
        int[] arr = {9,8,7,6,5,4,3,2,1};
        int n = arr.length;
        bubbleSortReverse(arr, n);
        System.out.println(Arrays.toString(arr));
    }
    private static void bubbleSortReverse(int[] arr, int n){
        if(n==0 || n==1){
            return;
        }
        
        for(int i = 0; i<n-1; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        bubbleSortReverse(arr, n-1);
    }
}

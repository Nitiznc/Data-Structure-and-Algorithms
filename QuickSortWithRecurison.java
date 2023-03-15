import java.util.*;

public class MyClass{
    public static void main(String[] args){
        int[] arr = {4,4,4,1,5,3,2,6,8,7,9,3,2,4,6,3,7,5,2,8,5,3,9,4};
        int start = 0;
        int end = arr.length-1;
        System.out.println(end);
        quickSort(arr, start, end);
        System.out.println(Arrays.toString(arr));
    }
    
    private static void quickSort(int[] arr, int start, int end){
        if(start>=end){
            return;
        }
        
        int pivot = partition(arr, start, end);
        // System.out.println(pivot);
        
        quickSort(arr, start, pivot-1);
        
        quickSort(arr, pivot+1, end);
    }
    
    private static  int partition(int[] arr, int start, int end){
        int pivot = arr[start];
        int count = 0;
        for(int i = start+1; i<=end; i++){
            if(arr[i]<=pivot){
                count++;
            }
        }
        int pivotIndex = start+count;
        
        int temp = arr[pivotIndex];
        arr[pivotIndex] = arr[start];
        arr[start] = temp;
        
        int i = start;
        int j = end;
        while(i<pivotIndex && j>pivotIndex){
            while(arr[i]<=pivot){
                i++;
            }
            while(arr[j]>pivot){
                j--;
            }
            if(i<pivotIndex && j>pivotIndex){
                int tp = arr[i];
                arr[i++] = arr[j];
                arr[j--] = tp;
            }
        }
        return pivotIndex;
    }
}

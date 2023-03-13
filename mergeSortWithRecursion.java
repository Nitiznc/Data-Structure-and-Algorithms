import java.util.*;

public class MyClass{
    public static void main(String[] args){
        int[] arr = {9,3,7,3,5,3,1,2,6,8,4};
        int n = arr.length;
        int start = 0;
        int end = n-1;
        mergeSortedArray(arr, start, end);
        System.out.println(Arrays.toString(arr));
    }
    private static void mergeSortedArray(int[] arr, int start , int end){
        if(start>=end){
            return;
        }
        int mid = start+(end-start)/2;
        
        // first half will be sort 
        mergeSortedArray(arr, start, mid);
        
        // second half will be sort
        mergeSortedArray(arr, mid+1, end);
        
        // merge this sort
        mergeSort(arr, start, end);
        
    }
    private static void mergeSort(int[] arr, int start, int end){
        int mid = start + (end-start)/2;
        
        int len1 = mid+1 - start;
        int len2 = end - mid;
        
      
        int[] arr1 = new int[len1];
        int[] arr2 = new int[len2];
        
        // copying values
        int mainArrayIndex = start;
        for(int i = 0; i<len1; i++){
            arr1[i] = arr[mainArrayIndex++];
        }
        
        mainArrayIndex = mid+1;
        for(int i = 0; i<len2; i++){
            arr2[i] = arr[mainArrayIndex++];
        }
        
        // sorting the array 
        int index1 = 0;
        int index2 = 0;
        mainArrayIndex = start;
        
        while(index1<len1 && index2<len2){
            if(arr1[index1]<arr2[index2]){
                arr[mainArrayIndex++] = arr1[index1++];
            }
            else{
                arr[mainArrayIndex++] = arr2[index2++];
            }
        }
        while(index1<len1){
            arr[mainArrayIndex++] = arr1[index1++];
        }
        while(index2<len2){
            arr[mainArrayIndex++] = arr2[index2++];
        }
    }
}

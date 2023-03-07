import java.util.*;

public class MyClass{
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6,7};
        int len = arr.length-1;
        int index = 0;
        int key = 4;
        boolean result = binarySearch(arr,index, len, key);
        System.out.println(result);
    }    
    private static boolean binarySearch(int[] arr,int index, int len, int key){
        int start = index;
        int end =len;
        int mid = start+(end-start)/2;
        if(start>end){
            return false;
        }
        if(arr[mid]==key){
            return true;
        }
        else if(arr[mid]>key){
            return binarySearch(arr, start, mid-1, key);
        }
        else{
            return binarySearch(arr, mid+1, end, key);
        }

    }
}

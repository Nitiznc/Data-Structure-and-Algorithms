import java.io.*;
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        int[] arr = {1, 3, 5, 7, 8, 999,23, 46, 75, 666,888};
        System.out.println(peakIndexInMountainArray(arr));
    }
    static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            int mid = start+(end-start)/2;
            if(arr[mid]>arr[mid+1]){
                end=mid;
            }
            else{
                start=mid+1;
            }
        }
        return start;
    }
}

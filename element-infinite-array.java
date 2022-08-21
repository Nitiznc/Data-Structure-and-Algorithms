import java.io.*;
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        int[] arr = {1, 3, 5, 7, 8, 23, 46, 75, 666,888};
        int target = 8;
        System.out.println(ans(arr, target));
    }
    static int ans(int[] arr, int target){
        int start = 0;
        int end = 1;
        while(target>arr[end]){
            int newStart = end+1;
            end = end + (end-start+1)*2;
            start = newStart;
        }
        return search(arr, target, start, end);
    }
    static int search(int[] arr, int target, int start, int end){
        while (end>=start){
            int mid = start+(end-start)/2;
            if (arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}

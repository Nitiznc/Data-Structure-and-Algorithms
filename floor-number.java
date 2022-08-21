import java.io.*;
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        int[] arr = {2,3,9,14,16,18,20};
        int target = 15;
        int ans = ceiling(arr, target);
        System.out.println(ans);
    }
    static int ceiling(int[] arr, int target) {
        int start = 0;
        int end = arr.length-1;
        while(end>=start){
            int mid = start + (end-start)/2;
            if (arr[mid]>target){
                end=mid-1;
            }
            else if (arr[mid]<target){
                start = mid+1;
            }
            else {
                return mid;
            }
        }
        return end;
    }
}

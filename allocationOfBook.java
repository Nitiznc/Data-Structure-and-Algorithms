import java.util.*;

public class MyClass{
    public static void main(String[] args){
        int[] arr = {12, 34, 67, 90};
        int start = 0;
        int end = 0;
        int count = 2;
        for(int i = 0; i<arr.length ; i++){
            end += arr[i];
        }
        int result = bookAllocation(arr, start, end, count);
        System.out.println(result);
    }
    private static int bookAllocation(int[] arr, int s, int e, int count){
        int ans = -1;
        int start = s;
        int end = e;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(isPossible(arr, count, mid)){
                ans = mid;
                end  = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return ans;
    }
    private static boolean isPossible(int[] arr,int count, int mid){
        int studentCount = 1;
        int pageNum = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(pageNum+arr[i]<=mid){
                pageNum += arr[i];
            }
            else{
                studentCount++;
                if(studentCount>count || arr[i] > mid){
                    return false;
                }
                pageNum = arr[i];
            }
        }
        return true;
    }
}

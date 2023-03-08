import java.util.*;

public class MyClass{
    public static void main(String[] args){
        int[] arr = {1,1,1,2,2,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3};
        int[] ans = {-1, -1};
        int start = search(arr, true, 1);
        int end = search(arr, false, 1);
        ans[0] = start;
        ans[1] = end;
        System.out.println(Arrays.toString(ans));
    }
    
    private static int search(int[] arr, boolean index, int target){
        int ans = -1;
        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start + (end-start)/2;
            if(arr[mid]>target){
                end = mid-1;
            }
            else if(arr[mid]<target){
                start = mid+1;
            }
            else{
                ans = mid;
                if(index){
                    end = mid-1;
                }
                else{
                    start = mid+1;
                }
            }
        }
        return ans;
    }
}

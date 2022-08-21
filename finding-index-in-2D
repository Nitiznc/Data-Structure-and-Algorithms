import java.io.*;
import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        int[][] arr = {
            {1,3,5},
            {2,4,6,8},
            {9,11,13,15}
        };
        int target = 15;
        int[] ans = search(arr, target);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr, int target){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}

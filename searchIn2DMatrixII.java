
import java.util.*;

public class MyClass{
    public static void main(String[] args){
        Scanner src = new Scanner(System.in);
        int[][] arr = new int[4][4];
        int m = 4;
        int n = 4;
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                arr[i][j] = src.nextInt();
            }
        }
        
        for(int i = 0; i<m; i++){
            for(int j = 0; j<n; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        boolean bool = finding(arr, 4, 4, 10);
        System.out.println(bool);
    }
    
    private static boolean finding(int[][] arr, int m , int n, int target){
        int start = 0;
        int end = n-1;
        while(start<m && end>=0){
            int element = arr[start][end];
            if(element == target){
               return true;
            }
            else if(element < target){
                start++;
            }   
            else{
                end--;
            }
        }
        return false;
    }
}

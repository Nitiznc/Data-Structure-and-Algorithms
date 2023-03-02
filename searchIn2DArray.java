import java.util.*;
public class MyClass {
    public static void main(String args[]) {
        Scanner src = new Scanner(System.in);
        int[][] arr = new int[4][4];
        for(int i = 0 ; i<4 ; i++){
            for(int j = 0 ; j<4 ; j++){
                arr[i][j] = src.nextInt();
            }
        }
        
        for(int i = 0 ; i<4 ; i++){
            for(int j = 0 ; j<4 ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        boolean bool = searchIn2DArray(arr, 4, 4, 8 );
        System.out.println(bool);
    }
    
    private static boolean searchIn2DArray(int[][] arr, int m, int n, int target){
        int start = 0;
        int end = m*n -1;
        
        while(start<=end){
            int mid = start+(end-start)/2;
            
            int element = arr[mid/n][mid%n];
            
            if(element == target){
                return true;
            }
            else if(element < target){
                start = mid+1;
            }
            else {
                end = mid-1;
            }
        }
        return false;
    }
}

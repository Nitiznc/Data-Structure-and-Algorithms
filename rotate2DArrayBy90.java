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
        
        rotate(arr, 4, 4);
        System.out.println();
        
        for(int i = 0 ; i<4 ; i++){
            for(int j = 0 ; j<4 ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
      
        rightToLeft(arr, 4, 4);
    }
    private static void rotate(int[][] arr, int m, int n){
        for(int i = 0; i < m; i++){
            for(int j = i+1; j < n ; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
    }
    
    private static void rightToLeft(int[][] arr, int m, int n){
        for(int i = 0; i < m; i++){
            for(int j = n-1; j >= 0; j-- ){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

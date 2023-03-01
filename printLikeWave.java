import java.util.*;

public class MyClass {
    public static void main(String args[]) {
        int[][] arr = new int[3][4];
        Scanner src = new Scanner(System.in);
        for(int i = 0 ; i < 3 ; i++){
            for(int j = 0 ; j < 4 ; j++){
                arr[i][j] = src.nextInt();
            }
        }
        
        
        for(int i = 0; i<3 ; i++){
            for(int j = 0 ; j<4 ; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        uptodown(arr, 3, 4);
        
    }
    
    private static void uptodown(int[][] arr, int n, int m){
        for(int j = 0; j < m; j++){
            if(j%2==0){
                for(int i = 0; i<n ; i++){
                    System.out.print(arr[i][j]+" ");
                }
                
                System.out.println();
            }
            else{
                for(int i = n-1; i>=0; i--){
                    System.out.print(arr[i][j]+" ");
                }
                System.out.println();
            }
        }
    }
}

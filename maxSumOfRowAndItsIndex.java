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
        maxRow(arr, 3, 4);
        
    }
    private static void maxRow(int[][] arr, int n, int m){
        int maxrow = -1;
        int sum = 0;
        int row = -1;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                sum +=arr[i][j];
            }
            if(sum>maxrow){
                maxrow = sum;
                row = i;
            }
            sum = 0;
        }
        System.out.println("The maximum sum of row : "+maxrow);
        System.out.println("The row number : "+row);
    }
}

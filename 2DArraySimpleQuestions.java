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
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
        isPresent(arr, 4, 3, 4);
        sumOfRow(arr, 3, 4);
        sumOfCol(arr, 3, 4);
        
    }
    
    private static void sumOfRow(int[][] arr, int n, int m){
        int sum = 0;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                sum += arr[i][j];
            }
            if(i==1){
                System.out.println(sum);
                break;
            }
        }
    }
    
    private static void sumOfCol(int[][] arr, int n, int m){
        int sum = 0;
        for(int j = 0; j < m ; j++){
            for(int i = 0; i < n; i++){
                sum += arr[i][j];
                System.out.println(sum);
            }
            System.out.println(sum);
            break;
        }
    }
    
    private static void isPresent(int[][] arr, int target, int n, int m){
        boolean bool = false;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(arr[i][j]==target){
                    bool = true;
                    break;
                }
                else{
                    bool = false;
                }
            }
        }
        if(bool == true){
            System.out.println("Target element is found");
        }
        else{
            System.out.println("Target elment is not  found ");
        }
    } 
}

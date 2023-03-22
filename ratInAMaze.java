import java.util.*;
public class MyClass {
    public static void main(String args[]) {
      ArrayList<String> result = new ArrayList<>();
      int[][] arr = {{1,0,0},{1,1,0},{1,1,1}};
      int n = arr[0].length;
      int[][]  visited = new int[n][n];
      for(int i =0; i<n ; i++){
          for(int j = 0; j<n; j++){
              visited[i][j] = 0;
          }
      }
      solve(0, 0, arr, n, result, "", visited);
      System.out.println(n);
      System.out.println(result);
    }
    private static void solve(int i, int j, int[][] m, int n, ArrayList<String> result, String str, int [][] visited){
        if(i == n-1 && j == n-1)    {
            result.add(str);
            return;
        }
        // Down
        if(i+1<n && visited[i+1][j]==0 && m[i+1][j]==1){
            visited[i][j] = 1;
            solve(i+1, j, m, n, result, str+'D', visited);
            visited[i][j] = 0;
        }
        // left
        if(j-1>=0 && visited[i][j-1]==0 && m[i][j-1]==1){
            visited[i][j] = 1;
            solve(i, j-1, m, n, result, str+'L', visited);
            visited[i][j] = 0;
        }
        // Right
        if(j+1<n && visited[i][j+1]==0 && m[i][j+1]==1){
            visited[i][j] = 1;
            solve(i, j+1, m, n, result, str+'R', visited);
            visited[i][j] = 0;
        }
        // Up
        if(i-1>=0 && visited[i-1][j]==0 && m[i-1][j]==1){
            visited[i][j] = 1;
            solve(i-1, j, m, n, result, str+'U', visited);
            visited[i][j] = 0;
        }
    }
}

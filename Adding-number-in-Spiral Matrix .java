class Solution {
    public int[][] generateMatrix(int n) {
        int row1 = 0;
        int row2 = n-1;
        int col1 = 0;
        int col2 = n-1;
        int[][] arr = new int[n][n];
        int val = 1;
        while(row1<=row2 && col1<=col2){
            
            for(int col=col1;col<=col2;col++){
                arr[row1][col] = val++;
            }
            
            for(int row=row1+1;row<=row2;row++){
                arr[row][col2] = val++;
            }
            
            if(row1<row2 && col1<col2){
                for(int col=col2-1;col>col1;col--){
                    arr[row2][col] = val++;
                }
                
                for(int row=row2;row>row1;row--){
                    arr[row][col1] = val++;
                }
                
            }
            row1++;
            row2--;
            col1++;
            col2--;
        }
        return arr;
    }
}

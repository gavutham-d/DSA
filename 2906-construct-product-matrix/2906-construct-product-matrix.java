class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[][] arr = new int[n][m];
        long pre = 1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = (int)pre;
                pre = (pre * grid[i][j]) % 12345;
            }
        }
        long suff = 1;
        for(int i=n-1;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                arr[i][j] = (int)((arr[i][j] * suff) % 12345);
                suff = (suff * grid[i][j]) % 12345;
            }
        }
        return arr;
    }
}
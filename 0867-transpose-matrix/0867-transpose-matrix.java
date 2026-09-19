class Solution {
    public int[][] transpose(int[][] matrix) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] arr = new int[m][n];
        int y = 0;
        for(int i=0;i<n;i++){
            int x = 0;
            for(int j=0;j<m;j++){
                arr[x][y]=matrix[i][j];
                x++;
            }
            y++;
        }
        return arr;
    }
}
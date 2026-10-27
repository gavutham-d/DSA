class Solution {
    public int[][] constructProductMatrix(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int l = m*n;
        int[] arr = new int[l];
        int k = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[k++]=grid[i][j];
            }
        }
        long pre = 1;
        int[] temp = new int[l];
        for(int i=0;i<l;i++){
            temp[i]= (int)pre;
            pre= (int)((pre * arr[i]) % 12345);
        }
        long suff = 1;
        for(int i=l-1;i>=0;i--){
            temp[i]= (int)((temp[i]*suff)%12345);
            suff =(int) ((suff * arr[i])%12345);
        }
        int[][] ans = new int[n][m];
        int z=0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                ans[i][j] = temp[z++];
            }
        }
        return ans;
    }
}
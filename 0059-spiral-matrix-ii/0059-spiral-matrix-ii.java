class Solution {
    public int[][] generateMatrix(int n) {
        int[][]answer = new int[n][n];
        int left = 0, right = n-1;
        int top = 0, bottom = n-1;
        int val = 1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++)
                answer[top][i]=val++;
            top++;
            for(int j=top;j<=bottom;j++)
                answer[j][right]=val++;
            right--;
            if(top<=bottom){
                for(int k=right;k>=left;k--)
                    answer[bottom][k]=val++;
                bottom--;
            }
            if(left<=right){
                for(int l=bottom;l>=top;l--)
                    answer[l][left]=val++;
                left++;
            }
        }
        return answer;
    }
}
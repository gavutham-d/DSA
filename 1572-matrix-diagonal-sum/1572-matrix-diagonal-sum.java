class Solution {
    public int diagonalSum(int[][] mat) {
        int i=0;
        int j=mat.length-1;
        int sum = 0;
        while(i<mat.length && j>=0){
            if(i!=j)
                sum=sum+mat[i][i]+mat[i][j];
            else
                sum+=mat[i][i];
            i++;
            j--;
        }
        return sum;
    }
}
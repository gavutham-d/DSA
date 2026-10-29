class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List <Integer> ans = new ArrayList<>();
        int bottom = matrix.length-1;
        int right = matrix[0].length-1;
        int left = 0;
        int top = 0;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++)
                ans.add(matrix[top][i]);
            top++;
            for(int j=top;j<=bottom;j++)
                ans.add(matrix[j][right]);
            right--;
            if(top<=bottom){
                for(int k=right;k>=left;k--)
                    ans.add(matrix[bottom][k]);
                bottom--;
            }
            if(left<=right){
                for(int l=bottom;l>=top;l--)
                    ans.add(matrix[l][left]);
                left++;
            }
        }
        return ans;
    }
}
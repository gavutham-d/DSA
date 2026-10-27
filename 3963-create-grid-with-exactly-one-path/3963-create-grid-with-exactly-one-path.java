class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans = new String[m];
        char[][] temp = new char[m][n];
        for(int i=0;i<1;i++){
            for(int j=0;j<n;j++){
                temp[i][j]='.';
            }
        }
        for(int i=0;i<m;i++){
            for(int j=n-1;j>n-2;j--){
                temp[i][j]='.';
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(temp[i][j]!='.')
                    temp[i][j]='#';
            }
        }
        for(int i=0;i<m;i++)
            ans[i]=new String(temp[i]);
        return ans;
    }
}
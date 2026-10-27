class Solution {
    public String[] createGrid(int m, int n) {
        String[] ans = new String[m];
        StringBuilder dot = new StringBuilder();
        for(int i=0;i<n;i++)
            dot.append(".");
        ans[0]=dot.toString();
        StringBuilder hash = new StringBuilder();
        for(int i=0;i<n-1;i++)
            hash.append("#");
        hash.append(".");
        for(int i=1;i<m;i++)
            ans[i] = hash.toString();
        return ans;
    }
}
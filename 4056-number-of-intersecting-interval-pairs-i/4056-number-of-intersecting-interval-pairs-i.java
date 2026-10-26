class Solution {
    public int countIntersectingIntervals(int[][] itv) {
        int n = itv.length;
        int count = 0;
        for(int i=0;i<n;i++){
            int st1 = itv[i][0];
            int en1 = itv[i][1];
            for(int j=i+1;j<n;j++){
                int st2 = itv[j][0];
                int en2 = itv[j][1];
                if(st1<=en2 && st2<=en1) count++;
            }
        }
        return count;
    }
}
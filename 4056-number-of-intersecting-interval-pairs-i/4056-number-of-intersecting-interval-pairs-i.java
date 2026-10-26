class Solution {
    public int countIntersectingIntervals(int[][] itv) {
        int count = 0;
        for(int i=0;i<itv.length;i++){
            for(int j=i+1;j<itv.length;j++){
                if(Math.max(itv[i][0],itv[j][0])<=Math.min(itv[i][1],itv[j][1]))
                    count++;
            }
        }
        return count;
    }
}
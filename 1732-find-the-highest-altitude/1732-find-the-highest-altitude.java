class Solution {
    public int largestAltitude(int[] gain) {
        int s = 0;
        int max = 0;
        for(int i=0;i<gain.length;i++){
            s+=gain[i];
            max = Math.max(s,max);
            
        }
        return max;
    }
}
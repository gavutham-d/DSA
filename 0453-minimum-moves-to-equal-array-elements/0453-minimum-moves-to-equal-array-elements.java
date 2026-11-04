class Solution {
    public int minMoves(int[] nums) {
        if(nums.length==1) return 0;
        int moves = 0;
        int min = Integer.MAX_VALUE;
        for(int n: nums){
            min = Math.min(min,n);
            moves += n;
        }
        return moves - nums.length * min;
    }
}
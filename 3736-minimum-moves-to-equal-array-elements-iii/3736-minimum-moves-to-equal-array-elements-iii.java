class Solution {
    public int minMoves(int[] nums) {
        int moves = 0;
        int max = nums[0];
        for(int i=1;i<nums.length;i++)
            if(nums[i]>max)
                max = nums[i];
        for(int num: nums)    
            moves += max-num;
        return moves;
    }
}
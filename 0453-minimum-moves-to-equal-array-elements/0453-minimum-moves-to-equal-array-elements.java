class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<=1) return 0;
        int moves = 0;
        for(int num: nums)
            moves += num-nums[0];
        return moves;
    }
}
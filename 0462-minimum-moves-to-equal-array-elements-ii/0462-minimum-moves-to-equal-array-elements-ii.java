class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int i = 0;
        int j = n-1;
        int moves = 0;
        while(j>i){
            moves += Math.abs(nums[i]-nums[j]);
            i++;j--;
        }
        return moves;
    }
}
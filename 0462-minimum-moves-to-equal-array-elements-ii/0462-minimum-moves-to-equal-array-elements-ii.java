class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int mid;
        if(n%2==0) mid = (n/2)-1;
        else mid = (n/2);
        int moves = 0;
        for(int i=0;i<nums.length;i++)
            moves += Math.abs(nums[i]-nums[mid]);
        return moves;
    }
}
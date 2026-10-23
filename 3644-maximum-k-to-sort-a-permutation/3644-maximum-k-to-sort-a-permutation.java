class Solution {
    public int sortPermutation(int[] nums) {
        int x = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=i)
                x = x & nums[i];
                if(x == 0) return 0;
        }
        return Math.max(x,0);
    }
}
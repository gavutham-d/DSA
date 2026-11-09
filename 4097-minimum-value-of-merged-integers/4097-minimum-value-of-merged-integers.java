class Solution {
    public int minMergedInteger(int[] nums) {
        int min = Integer.MAX_VALUE;
        for(int i=0;i<nums.length-1;i+=2){
                String t = Integer.toString(nums[i])+Integer.toString(nums[i+1]);
                min = Math.min(min,Integer.valueOf(t));
        }
        return min;
    }
}
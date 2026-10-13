class Solution {
    public long maxAlternatingSum(int[] nums) {
        for(int i=0;i<nums.length;i++)
            nums[i]=Math.abs(nums[i]);
        Arrays.sort(nums);
        int d = nums.length/2;
        long s = 0;
        for(int i=d;i<nums.length;i++)
            s+=Math.pow(nums[i],2);
        for(int i=0;i<d;i++)
            s-=Math.pow(nums[i],2);
        return s;
    }
}
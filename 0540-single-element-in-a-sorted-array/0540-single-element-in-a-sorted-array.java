class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int l = 1;
        int r = n-2;
        if(n==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[n-1]!=nums[n-2]) return nums[n-1];
        while(l<=r){
            int m = l+(r-l)/2;
            if(nums[m]!=nums[m-1] && nums[m]!=nums[m+1])
                return nums[m];
            if(nums[m]==nums[m-1]){
                if((m-1)%2!=0)  r=m-2;
                else    l=m+1;
            }
            else{
                if(m%2!=0)  r=m-1;
                else    l=m+2;
            }
        }
        return -1;
    }
}
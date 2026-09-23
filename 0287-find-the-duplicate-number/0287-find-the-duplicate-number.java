class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        int n=nums.length;
        while(i<n){
            int k = nums[i]-1;
            if(nums[i]!=nums[k]){
                int t = nums[i];
                nums[i] = nums[k];
                nums[k] = t;
            }
            else{
                i++;
            }
        }
        // for(int j=0;j<n-1;j++){
        //     if(nums[j]==nums[j+1])
        //         return nums[j];
        // }
        return nums[n-1];
    }
}
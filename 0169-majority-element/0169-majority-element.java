class Solution {
    public int majorityElement(int[] nums) {
        int voter=nums[0];
        int n = nums.length;
        int votecount = 1;
        for(int i=1;i<n;i++){
            if(nums[i]==voter) votecount++;
            else --votecount;
            if(votecount==0){
                voter=nums[i];
                votecount=1;
            }
        }
        return voter;
    }
}
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans  = new ArrayList<>();
        int n = nums.length;
        for(int i=0;i<n-2;i++){
            int j = i+1,k=n-1;
            if(i>0 && nums[i]==nums[i-1]) continue;
            while(j<k){
                int s = nums[i]+nums[j]+nums[k];
                if(s==0){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    j++;
                    k--;
                    while(j<k && nums[j]==nums[j-1]) j++;
                }
                else if(s<0) j++;
                else k--;
            }
        }
        return ans;
    }
}
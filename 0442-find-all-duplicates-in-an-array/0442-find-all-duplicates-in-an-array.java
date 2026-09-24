class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int n = nums.length;
        int i = 0;
        List<Integer> al = new ArrayList<>();
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
        for(int j=0;j<nums.length;j++){
            if(nums[j]!=j+1)
                al.add(nums[j]);
        }
        return al;
    }
}
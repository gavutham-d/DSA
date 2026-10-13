class Solution {
    public void sortColors(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=nums[j];
                nums[j]=0;
                j++;
            }
        }
        for(int i=j;i<nums.length;i++){
            if(nums[i]==1){
                nums[i]=nums[j];
                nums[j]=1;
                j++;
            }
        }
    }
}
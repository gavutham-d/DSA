class Solution {
    public long maximizeSum(int[] nums, int k) {
        int n = nums.length;
        long sum = 0;    
        int[] gains = new int[n];
        for(int i=0;i<n;i++){
            int maxNum = reArrange(nums[i]);
            sum += nums[i];
            gains[i] = maxNum - nums[i];
        } 
        Arrays.sort(gains);
        for(int i=n-1;i>=n-k;i--)
            sum += gains[i];
        return sum;
    }
    public int reArrange(int num){
        int[] temp = new int[10];
        int count = 0;
        while(num>0){
            temp[count++] = num % 10;
            num/=10;
        }
        Arrays.sort(temp,0,count);
        int res = 0;
        for(int i=count-1;i>=0;i--)
            res = res * 10 + temp[i];
        return res;
    }
}
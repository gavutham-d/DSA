class Solution {
    public int minSwaps(int[] nums) {
        int n = nums.length;
        if(n<2) return 0;
        long[] arr = new long[n];
        for(int i=0;i<n;i++)
            arr[i]=(long)digitSum(nums[i])<<32|nums[i];
        Arrays.sort(arr);
        Map<Integer,Integer> rank = new HashMap<>();
        for(int k=0;k<n;k++) rank.put((int)arr[k],k);
        int[] home = new int[n];
        for(int i=0;i<n;i++) home[i]=rank.get(nums[i]);
        int sw = 0;
        for(int i=0;i<n;i++){
            while(home[i]!=i){
                int j = home[i];
                home[i] = home[j];
                home[j] = j;
                sw++;
            }
        }
        return sw;
    }
    public int digitSum(int n){
        int s = 0;
        while(n>0){
            int r = n%10;
            s+=r;
            n/=10;
        }
        return s;
    }
}
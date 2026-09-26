class Solution {
    public boolean checkPrimeFrequency(int[] nums) {
        int n = nums.length;
        for(int i=0;i<n;i++){
            int c = 1;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j] && i!=j)
                    c++;
            }
            if(isPrime(c) && c>1)
                return true;
        }
        return false;
    }
    boolean isPrime(int n){
        if(n==2) return true;
        for(int i=2;i<=Math.sqrt(n)+1;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}
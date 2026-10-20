class Solution {
    public int duplicateNumbersXOR(int[] nums) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        int ans = 0;
        for(int num: hm.keySet()){
            if(hm.get(num)==2)
                if(ans==0)
                    ans = num;
                else
                    ans = ans ^ num;
        }
        return ans;
    }
}
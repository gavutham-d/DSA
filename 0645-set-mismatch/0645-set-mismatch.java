class Solution {
    public int[] findErrorNums(int[] arr) {
        int i = 0;
        int n = arr.length;
        int[] nums = new int[2];
        while(i<n){
            int k = arr[i]-1;
            if(arr[i]!=arr[k]){
                int t = arr[i];
                arr[i] = arr[k];
                arr[k] = t;
            }
            else{
                i++;
            }
        }
        for(int j=0;j<n;j++){
            if(arr[j]!=j+1){
                nums[0]=arr[j];
                nums[1]=j+1;
            }
        }
        return nums;
    }
}
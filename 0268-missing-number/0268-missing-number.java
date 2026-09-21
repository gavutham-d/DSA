class Solution {
    public int missingNumber(int[] nums) {
        return cyclicSort(nums);
    }
    public int cyclicSort(int[] arr){
        int i=0;
        while(i<arr.length){
            int t = arr[i];
            if(arr[i]<arr.length && arr[i]!=arr[t]){
                swap(arr,i,t);
            }
            else i++;
        }
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=j)
                return j;
        }
        return arr.length;
    }
    public void swap(int[] arr,int st,int en){
        int t = arr[st];
        arr[st] = arr[en];;
        arr[en] = t;
    }
}
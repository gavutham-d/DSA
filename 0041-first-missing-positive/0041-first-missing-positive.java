class Solution {
    public int firstMissingPositive(int[] arr) {
        int n = arr.length;
        int j = 0;
        while(j<n){
            int k = arr[j]-1;
            if(arr[j]>0 && arr[j]<=n && arr[j]!=arr[k]){
                int t = arr[j];
                arr[j] = arr[k];
                arr[k] = t;
            }
            else{
                j++;
            }
        }
        for(int i=0;i<n;i++){
            if(arr[i]!=i+1)
                return i+1;
        }
        return n+1;
    }
}
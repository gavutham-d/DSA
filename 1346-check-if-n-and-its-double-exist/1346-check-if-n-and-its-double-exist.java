class Solution {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int t = 2*arr[i];
            int l = 0;
            int r = arr.length-1;
            while(l<=r){
                int m = l+(r-l)/2;
                if(arr[m]==t && i!=m) return true;
                else if(arr[m]>t) r=m-1;
                else l=m+1;
            }
        }
        return false;
    }
    public void selection(int[] arr,int n){
        for(int i=0;i<n;i++){
            int last = n-i-1;
            int maxind = getMaxindex(arr,0,last);
            swap(arr,maxind,last);
        }
    }
    public int getMaxindex(int[] arr,int st,int en){
        int max = st;
        for(int i=st;i<en;i++){
            if(arr[i]>arr[max]) max = i;
        }
        return max;
    }
    public void swap(int[] arr,int max,int last){
        int t = arr[max];
        arr[max] = arr[last];
        arr[last] = t;
    }
}
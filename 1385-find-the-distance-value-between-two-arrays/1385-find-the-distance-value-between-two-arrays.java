class Solution {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        // Arrays.sort(arr2);
        int count = 0;
        for(int i=0;i<arr1.length;i++){
            boolean f = true;
            for(int j=0;j<arr2.length;j++){
                int t = arr1[i]-arr2[j];
                if(Math.abs(t)<=d){
                    f = false;
                }
            }
            if(f) count++;
        }
        return count;
    }
}
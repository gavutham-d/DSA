class Solution {
    public int getXORSum(int[] arr1, int[] arr2) {
        int ans = arr1[0];
        for(int i=1;i<arr1.length;i++){
            ans ^= arr1[i];
        }
        int sol = arr2[0];
        for(int i=1;i<arr2.length;i++){
            sol ^= arr2[i];
        }
        return ans & sol;
    }
}
class Solution {
    public List<Integer> findDisappearedNumbers(int[] arr) {
        int i = 0;
        int n = arr.length;
        List<Integer> al = new ArrayList<>();
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
            if(j+1!=arr[j]) al.add(j+1);
        }
        return al;
    }
}
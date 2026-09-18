class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        List <Integer> al = new ArrayList<>();
        int i = num.length-1;
        while(i>=0 || k!=0){
            if(i>=0){
                k+=num[i--];
            }
            al.addFirst(k%10);
            k/=10;
        }
        return al;
    }
}
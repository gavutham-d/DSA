class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> hs = new HashSet<>();
        for(int num: arr){
            if(hs.contains(num*2) || (num%2==0 && hs.contains(num/2)))
                return true;
            hs.add(num);
        }
        return false;
    }
}
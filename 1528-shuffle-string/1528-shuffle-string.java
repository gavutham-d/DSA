class Solution {
    public String restoreString(String s, int[] ind) {
        char[] arr = new char[s.length()];
        for(int i=0;i<s.length();i++){
            arr[ind[i]]=s.charAt(i);
        }
        return new String(arr);
    }
}
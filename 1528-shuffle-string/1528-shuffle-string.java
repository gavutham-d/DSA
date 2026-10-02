class Solution {
    public String restoreString(String s, int[] ind) {
        char[] arr = new char[s.length()];
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char d = s.charAt(i);
            arr[ind[i]]=d;
        }
        sb.append(arr);
        return sb.toString();
    }
}
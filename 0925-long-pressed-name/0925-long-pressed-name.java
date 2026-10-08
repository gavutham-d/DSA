class Solution {
    public boolean isLongPressedName(String n, String t) {
        int i=0;
        int j=0;
        while(j<t.length()){
            if(i<n.length() && n.charAt(i)==t.charAt(j))
                ++i; 
            else if(j==0||t.charAt(j)!=t.charAt(j-1)){
                return false;
            }
            ++j;
        }
        return i==n.length();
    }
}
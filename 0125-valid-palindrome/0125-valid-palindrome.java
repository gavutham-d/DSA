class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty()) return true;
        int i = 0;
        int j = s.length()-1;
        while(i<=j){
            char ch = s.charAt(i);
            char mh = s.charAt(j);
            if(!Character.isLetterOrDigit(ch)) i++;
            else if(!Character.isLetterOrDigit(mh)) j--;
            else{
                if(Character.toLowerCase(ch) != Character.toLowerCase(mh)){
                    return false;
                }
                i++;
                j--;
            }
        }
        return true;
    }
}
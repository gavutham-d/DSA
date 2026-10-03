class Solution {
    public String sortSentence(String s) {
        String[] wd = s.split(" ");
        String[] ans = new String[wd.length];
        for(String word: wd){
            int i = word.charAt(word.length()-1)-'0'-1;
            ans[i] = word.substring(0,word.length()-1);
        }
        return String.join(" ",ans);
    }
}
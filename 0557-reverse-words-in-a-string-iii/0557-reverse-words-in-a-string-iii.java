class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        String[] temp = s.split(" ");
        for(int i=0;i<temp.length;i++){
            if(i>0) sb.append(" ");
            sb.append(new StringBuilder(temp[i]).reverse());
        }
        return sb.toString();
    }
}
class Solution {
    public String freqAlphabets(String s) {
        int n = s.length();
        StringBuilder ns = new StringBuilder();
        int i = 0;
        while(i<n){
            if(i+2<n && s.charAt(i+2)=='#'){
                String temp = s.substring(i,i+2);
                int k = Integer.parseInt(temp);
                ns.append((char)(k+96));
                i+=3;
            }
            else{
                int k = s.charAt(i)-'0';
                ns.append((char)(k+96));
                i++;
            }
        }
        return ns.toString();
    }
}
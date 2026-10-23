class Solution {
    public List<String> printVertically(String s) {
        String[] words = s.split(" ");
        int mx = 0;
        for(String w: words)
            mx = Math.max(w.length(),mx);
        List <String> ans = new ArrayList<>();
        for(int i=0;i<mx;i++){
            StringBuilder sb = new StringBuilder();
            for(String w: words){
                sb.append(i<w.length() ? w.charAt(i) : " ");
            }
            while(sb.charAt(sb.length()-1)==' ')
                sb.deleteCharAt(sb.length()-1);
            ans.add(sb.toString().stripTrailing());
        }
        return ans;
    }
}
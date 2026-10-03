class Solution {
    public String interpret(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            char d = ' ';
            if(i<s.length()-1)
                d = s.charAt(i+1);
            if(c=='('){
                if(d==')')
                {
                    sb.append('o');
                    i++;
                    continue;
                }
                sb.append("al");
                i+=3;
                continue;
            }
            sb.append('G');
        }
        return sb.toString();
    }
}
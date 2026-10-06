class Solution {
    public boolean judgeCircle(String m) {
        StringBuilder sb = new StringBuilder(m);
        int f = 0;
        for(int i=0;i<m.length();i++){
            char ch = sb.charAt(i);
            if(ch=='U')
                f+=2;
            if(ch=='D')
                f-=2;
            if(ch=='L')
                f+=10;
            if(ch=='R')
                f-=10;
        }
        return f==0;
    }
}
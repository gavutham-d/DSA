class Solution {
    public boolean halvesAreAlike(String s) {
        String a = s.substring(0,s.length()/2);
        String b = s.substring(s.length()/2,s.length());
        a = a.toLowerCase();
        b = b.toLowerCase();
        int x = 0;
        int y = 0;
        for(int i=0;i<s.length()/2;i++){
            char c = a.charAt(i);
            char d = b.charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                x++;
            if(d=='a'||d=='e'||d=='i'||d=='o'||d=='u')
                y++;
        }
        return x==y;
    }
}
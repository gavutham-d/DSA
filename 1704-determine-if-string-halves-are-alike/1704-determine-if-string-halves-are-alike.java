class Solution {
    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();
        int n = s.length();
        int j = n/2;
        int x = 0;
        for(int i=0;i<n/2;i++){
            char c = s.charAt(i);
            char d = s.charAt(j);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
                x++;
            if(d=='a'||d=='e'||d=='i'||d=='o'||d=='u')
                x--;
            j++;
        }
        return x==0;
    }
}
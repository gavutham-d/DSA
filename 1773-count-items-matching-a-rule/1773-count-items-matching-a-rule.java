class Solution {
    public int countMatches(List<List<String>> items, String rk, String rv) {
        int i = 0;
        if(rk.equals("color")) i=1;
        else if(rk.equals("name")) i=2;
        int c=0;
        for(List<String> item:items){
            if(item.get(i).equals(rv)) c++;
        } 
        return c;
    }
}
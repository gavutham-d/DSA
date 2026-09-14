class Solution {
    public int countMatches(List<List<String>> items, String rk, String rv) {
        int c = 0;
        for(int i=0;i<items.size();i++){
            if(rk.equals("type")&&items.get(i).get(0).equals(rv)) c++;
            if(rk.equals("color")&&items.get(i).get(1).equals(rv)) c++;
            if(rk.equals("name")&&items.get(i).get(2).equals(rv)) c++;
        }
        return c;
    }
}
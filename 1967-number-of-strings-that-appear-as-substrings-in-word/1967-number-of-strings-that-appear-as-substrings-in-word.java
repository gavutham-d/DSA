class Solution {
    public int numOfStrings(String[] p, String w) {
        int count = 0;
        for(String word: p){
            if(w.contains(word))
                count++;
        }
        return count;
    }
}
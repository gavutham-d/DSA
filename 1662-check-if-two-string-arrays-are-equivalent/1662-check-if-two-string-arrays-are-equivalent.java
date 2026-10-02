class Solution {
    public boolean arrayStringsAreEqual(String[] w1, String[] w2) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        for(String c : w1){
            sb1.append(c);
        }
        for(String c : w2){
            sb2.append(c);
        }
        return sb1.toString().equals(sb2.toString());
    }
}
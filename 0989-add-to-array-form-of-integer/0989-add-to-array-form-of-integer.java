import java.math.BigInteger;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        StringBuilder sb = new StringBuilder();
        for(int d:num){
            sb.append(d);
        }
        BigInteger b = new BigInteger(sb.toString());
        b = b.add(BigInteger.valueOf(k));
        String r = b.toString();
        List<Integer> al = new ArrayList<>();
        for(char c: r.toCharArray()){
            al.add(Character.getNumericValue(c));
        }
        return al;
    }
}
class Solution {
    public String defangIPaddr(String ads) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<ads.length();i++){
            if(ads.charAt(i)=='.')
                sb.append("[.]");
            else
                sb.append(ads.charAt(i));
        }
        return sb.toString();
    }
}
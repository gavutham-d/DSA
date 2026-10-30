class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long volume = (long) length* (long) width * (long)height;
        boolean isBulky = false;
        boolean isHeavy = false;
        if(length>=10000 || width>=10000 || height>=10000 || mass>=10000 || volume>=1000000000)
            isBulky = true;
        if(mass>=100) isHeavy = true;
        if(isBulky && isHeavy) return "Both";
        else if(isBulky && !isHeavy) return "Bulky";
        else if(!isBulky && isHeavy) return "Heavy";
        else return "Neither";
    }
}
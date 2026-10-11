class Solution {
    public boolean isPerfectSquare(int num) {
        long st = 1;
        long end = num;
        while(st<=end){
            long m = st+(end-st)/2;
            long t = m*m;
            if(t==num) return true;
            if(t<num) st=m+1;
            else end=m-1;  
        }
        return false;
    }
}
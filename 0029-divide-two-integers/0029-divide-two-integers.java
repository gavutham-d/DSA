class Solution {
    public int divide(int dd, int ds) {
        long a = dd;
        long b = ds;
        boolean n = (a<0) ^ (b<0);
        a = Math.abs(a);
        b = Math.abs(b);
        long q = 0;
        while(a>=b){
            long cds = b;
            long m = 1;
            while(a>=cds+cds){
                cds+=cds;
                m+=m;
            }
            a-=cds;
            q+=m;
        }
        if(n)   q = -q;
        if(q>Integer.MAX_VALUE) return Integer.MAX_VALUE;
        if(q<Integer.MIN_VALUE) return Integer.MIN_VALUE;
        return (int)q;
    }
}
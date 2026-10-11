/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        long st = 0;
        long en = n;
        while(st<=en){
            long m = st+(en-st)/2;
            if(isBadVersion((int)m)){
                en=m-1;
                // c++;
            }
            else{
                st=m+1;
            }
        }
        return (int)st;
    }
}
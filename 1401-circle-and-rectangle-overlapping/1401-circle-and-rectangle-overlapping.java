class Solution {
    public boolean checkOverlap(int r, int xc, int yc, int x1, int y1, int x2, int y2) {
        int xclose = Math.max(x1,Math.min(xc,x2));
        int yclose = Math.max(y1,Math.min(yc,y2));
        int dx = xc - xclose;
        int dy = yc - yclose;
        return dx*dx + dy*dy <= r*r;
    }
}
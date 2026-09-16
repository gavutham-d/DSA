class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int i=0;i<n;i++){
            int x = 0;
            int y = n-1;
            while(x<=y){
                int t = image[i][x];
                image[i][x] = image[i][y];
                image[i][y] = t;
                x++;
                y--;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(image[i][j]==0) image[i][j]=1;
                else image[i][j]=0;
            }
        }
        return image;
    }
}
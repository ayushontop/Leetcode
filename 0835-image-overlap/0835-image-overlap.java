class Solution {
    
    public int largestOverlap(int[][] img1, int[][] img2) {
    
        int  rows= img1.length;
        int col = img1[0].length;
        int maxc= 0;
        for( int sr=0;sr<rows;++sr)
        {
            for(int sc=0;sc<col;++sc)
            {
                maxc= Math.max(maxc, countover(img1,img2, sr, sc));
                maxc= Math.max(maxc, countover(img1,img2,-sr, sc));
                maxc= Math.max(maxc, countover(img1,img2,sr, -sc));
                maxc= Math.max(maxc, countover(img1,img2, -sr, -sc));
            }
        }
        return maxc;
    }
    
    int countover(int[][] img1, int[][] img2, int sr, int sc)
    {
        int rows= img1.length;
        int cols= img1[0].length;
        int count=0;
        for( int r=0;r<rows;++r)
        {
            for( int c=0;c<cols;++c)
            {
                int nr= r+sr;
                int nc= c+sc;
                int pixel= (nr<0||nc<0||nr>=rows|| nc>= cols)? 0 : img1[nr][nc];
                if(pixel==1 && pixel == img2[r][c])
                    count++;
            }
        }
                   return count;
    }
    
}
class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int[] ans=new int[2];
        int max= Integer.MIN_VALUE;
        for(int i=0;i<mat.length;i++)
        {
            for(int j=0;j<mat[i].length;j++)
            {
                if(mat[i][j]>max)
                {
                    max= mat[i][j];
                    ans[0]=i;
                    ans[1]=j;
                }
            }
        }
        return ans;
    }
}
class Solution {
    public int[][] matrixReshape(int[][] nums, int r, int c) {
      int x=nums.length;
    int y=nums[0].length;
    if ((x * y)!=(r * c)) 
    {
        return nums;
    }
    int [][] output_arr = new int[r][c]; 
    int xnum=0;  
    int column_num=0;
    for(int i=0;i<x;i++)
    {
        for(int j=0;j<y;j++)
        {
            output_arr[xnum][column_num]=nums[i][j]; 
            column_num++; 
            if( column_num == c) 
            {
                column_num=0;
                xnum ++;
            }
        }
    }
    return output_arr;
    }
}

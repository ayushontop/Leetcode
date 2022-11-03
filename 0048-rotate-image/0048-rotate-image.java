class Solution {
    public void rotate(int[][] matrix) {
        int rows= matrix.length;
        int col= matrix[0].length;
        for( int i=0;i<rows;i++)
        {
            for(int j=i;j<col;j++)
            {
                int temp= matrix[i][j];
                matrix[i][j]= matrix[j][i];
                matrix[j][i]=temp;
                
            }
        }
         for( int i=0;i<rows;i++)
         {
              for(int j=0;j<matrix.length/2;j++)
              {
                  int temp= matrix[i][j];
                  matrix[i][j]= matrix[i][matrix.length-1-j];
                  matrix[i][matrix.length-1-j]= temp;
                  
              }
         }

    }
} 
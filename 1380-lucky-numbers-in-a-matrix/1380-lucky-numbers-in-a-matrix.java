class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List ans= new ArrayList();
        List a= new ArrayList();
        List result= new ArrayList();
        int cmax=0; int cmin=Integer.MAX_VALUE;
        for(int i=0;i<matrix.length;i++)
        {
            
            cmin=Integer.MAX_VALUE;
            
             for(int j=0;j<matrix[i].length;j++)
             {
                 if(matrix[i][j]<cmin)
                 {
                     cmin=matrix[i][j];
                 }
                 
             }
            a.add(cmin);
        }   
         // a.add(cmin);
        for(int i=0;i<matrix[0].length;i++)
         {
            
            cmax=Integer.MIN_VALUE;
            
             for(int j=0;j<matrix.length;j++)
             {
                 if(matrix[j][i]>cmax)
                 {
                     cmax=matrix[j][i];
                 }
                 
             }
            ans.add(cmax);
          }
          for(int i=0;i<a.size();i++)
            
            if(ans.contains(a.get(i)))
            {
                result.add(a.get(i));
            }
        return result;
        
    
        
        }
}
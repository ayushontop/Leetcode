class Solution {
    public int maximumWealth(int[][] accounts) 
    {
        int i,j;
        int sum=0;
        int max=0;

        for(i=0;i<accounts.length;i++)
        {
            sum=0;
            
            for(j=0;j<accounts[i].length;j++)
            {   
                sum+=accounts[i][j];
                if(sum>max)
                {
                   max=sum; }
            } 
        
        }
        return max;
}}
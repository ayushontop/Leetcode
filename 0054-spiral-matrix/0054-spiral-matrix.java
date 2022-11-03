class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0;
        int down= matrix.length-1;
        int left=0;
        int right= matrix[0].length-1;
        int dir=0;
        List<Integer> ans= new ArrayList<Integer>();
        while(top<=down&& left<=right)
        {
            if(dir==0)
            {
                for(int i=left; i<= right;i++)
                {
                    ans.add(matrix[top][i]);
                    
                }
                top++;
            }
            else if(dir==1)
            {
                for(int i=top;i<=down;i++)
                {
                    ans.add(matrix[i][right]);
                }
                right--;
            }
            else if(dir==2)
            {
                for(int i=right;i>=left;i--)
                {
                    ans.add(matrix[down][i]);
                }
                down--;
            }
            else if(dir==3)
            {
                for(int i=down;i>=top;i--)
                {
                    ans.add(matrix[i][left]);
                }
                left++;
            }
            dir= (dir+1)%4;
        }
        return ans;
        
    }
}
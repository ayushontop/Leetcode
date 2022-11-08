class Solution {
    public int maxDepth(String s) {
        int count=0;
        int max=Integer.MIN_VALUE;
        for(char c:s.toCharArray())
        {
            if(c=='(')
            {
                count++;
            }
            if(c==')')
            {
                count--;
            }
            if(count>max)
            {
                max=count;
            }
        }
        return max;
        
    }
}
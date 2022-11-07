class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sa= new StringBuilder();
        int count=0;
        
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(c=='(')
            {
                    if(count>0)
                    {
                        sa.append(c);
                    }
                                        count++;

                
            }
            else
            {
                count--;
                if(count!=0)
                {
                sa.append(c);
                }
            }
        }
        return sa.toString();
        
    }
}
class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans=new StringBuilder();
        for(char c:s.toCharArray())
        {
            if(ans.length()>0&&ans.charAt(ans.length()-1)==c)
            {
                ans.deleteCharAt(ans.length()-1);
            }
            else
            {
                ans.append(c);
            }
        }
        return ans.toString();
        
    }
}
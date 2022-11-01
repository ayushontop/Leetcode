class Solution {
    public boolean isPalindrome(String s) {
        if(s.isEmpty())
        {   
        return true;
        }
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        
        return a(0,s);
        
        
    
        
    }
    
    public Boolean a(int i, String s)
    {
        if(i>=s.length()/2)
        {
            return true;
        }
        if(s.charAt(i)!=s.charAt(s.length()-i-1))
        {
            return false;
        }
        
        return a(i+1,s);
        
        
    }
}
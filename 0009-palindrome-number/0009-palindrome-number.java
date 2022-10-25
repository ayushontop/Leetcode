class Solution {
    public boolean isPalindrome(int x) {
       
        int orig = x;      
        int ans=0;
        while(x>0)
        {
            ans=x%10+ans*10;
            
            x/=10;
            
        }
        return (orig==ans)? true : false;
      
}
}
class Solution {
    public boolean isHappy(int n) {
        
        int s=n;
        int f=n;
        do{
            f=square(square(f));
            s=square(s);
        }
        while(s!=f);
            
        if(s==1)
        {   
        return true;}
        else 
            return false;
        
    }
    private int square(int num)
    {
        int ans=0;
        while(num>0)
        {
            int rem=num%10;
            ans+=rem*rem;
            num/=10;
        }
        return ans;
    }
}
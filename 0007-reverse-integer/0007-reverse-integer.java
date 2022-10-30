class Solution {
    public int reverse(int x) {
         int num=0;
         int x2;
        
        if(x<0)
        {
             x2= Math.abs(x);
        }
        else
        {
            x2=x;
        }
        while(x2>0)
        {
            if(num>Integer.MAX_VALUE/10)
            {
                return 0;
            }
            num= x2%10+10*num;
            x2=x2/10;
            
        }
        if(x<0)
        {
            return num*-1;
            }
        return num;
        
    }
}
class Solution {
    public boolean isPerfectSquare(int num) {
        long start=1;
        long end=num;
        while(start<=end)
        {
            long mid=start+(end-start)/2;
            long t= mid*mid;
            if(t>num)
                end=mid-1;
            
            else if(t<num)
                start=mid+1;
            else
                return true;


        }
//        System.out.println("false");
        return false;
        
    }
}
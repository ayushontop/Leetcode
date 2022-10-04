class Solution {
    public int[] runningSum(int[] nums) {
        int n=nums.length;
        int[] sum =new int [n];
        int i;
        int ans=0;
        for(i=0;i<nums.length;i++)
        {   
            ans+=nums[i];
            sum[i]+=ans;
    }
        
        
        return sum;
    }
}
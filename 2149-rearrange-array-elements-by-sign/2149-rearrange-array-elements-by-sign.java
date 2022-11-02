class Solution {
    public int[] rearrangeArray(int[] nums) {
        int p=0;
        int n=0;
        int i=0;
        int[] ans = new int[nums.length];
        while(p<nums.length&&n<nums.length)
        {
            while(!(nums[p]>=0))
            {
                p++;
            }
            ans[i]=nums[p];
            i++;
            p++;
            while(!(nums[n]<0))
            {
                n++;
            }
            ans[i]=nums[n];
            i++;
            n++;
        }
       return ans;
        
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int i,j;
        int[] ans= new int[2];
        
        for(i=0;i<nums.length;i++)
        {
            for(j=i+1;j<nums.length;j++)
            {
               if(target==nums[i]+nums[j])
               {
                   ans[0]=i;
                   ans[1]=j;
               }
            }
        }
        return ans;
        
        
    }
}
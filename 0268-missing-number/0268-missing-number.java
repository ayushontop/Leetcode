class Solution {
    public int missingNumber(int[] nums) {
        int i=0;
        while(i<nums.length)
        {
            int cor=nums[i];
            if(nums[i]<nums.length&& nums[i]!=nums[cor])
            {
                int temp= nums[i];
                nums[i]= nums[cor];
                nums[cor]= temp;
            }
            else 
            {
                i++;
            }
        }
        for( i=0;i<nums.length;i++)
        {
            if(nums[i]!=i)
            {
                return i;
            }
        }
        return nums.length;
        
        
    }
}
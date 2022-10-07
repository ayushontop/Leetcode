class Solution {
public:
    int missingNumber(vector<int>& nums) {
       int i=0;
        while(i<nums.size())
        {
            int cor=nums[i];
             if(nums[i]<nums.size()&&nums[i]!= nums[cor])
            {
                int temp=nums[i];
                nums[i]=nums[cor];
                nums[cor]=temp;
                
            }
            
            else 
                i++;
        }
        for(int i=0;i<nums.size();i++)
        {
            if(nums[i]!=i)
            {
                return i;
            }

        }
        return nums.size();
        
        
    }
};
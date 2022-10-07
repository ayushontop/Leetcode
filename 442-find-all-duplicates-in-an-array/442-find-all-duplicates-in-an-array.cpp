class Solution {
public:
    vector<int> findDuplicates(vector<int>& nums) {
        vector<int> v;
        int i=0;
        while(i<nums.size())
        {
            int cor=nums[i]-1;
            if(nums[i]!=nums[cor])
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
            if(nums[i]!=i+1)
            {
                v.push_back(nums[i]);
                
            }
        }
        return v;
        
    }
};
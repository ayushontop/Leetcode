class Solution {
public:
    vector<int> findDisappearedNumbers(vector<int>& nums) {
         int i=0;
        vector<int> v;
        while(i<nums.size())
        {
            int cor=nums[i]-1;
             if(nums[i]!= nums[cor])
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
                v.push_back(i+1);
            }
            
            

        }
        // if(nums[nums.size()-1]!=nums.size()-1)
        // {
        //     v.push_back(nums.size()-1);
        // }
        return v;
    }
};
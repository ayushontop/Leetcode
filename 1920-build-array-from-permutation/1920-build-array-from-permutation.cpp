class Solution {
public:
    vector<int> buildArray(vector<int>& nums) {
       
         // <int> a= new vector<int>;
        // int a[nums.size()];
        vector<int>a(nums.size());
        for(int i=0;i<nums.size();i++)
        {
            a[i]=nums[nums[i]];
            }
        // for(int i=0;i<nums.size();i++)
        // {
        //     system.out.println(a[i]);
        // }
        return a;
    
        
    }
};
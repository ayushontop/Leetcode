class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] ans= new int[2*n];
        int i;
        int j=0;
        for(i=0;i<n;i++)
        {
            j=i*2;  
            ans[j]=nums[i];
           
            
            
            
            
        }
        j=1;
         for(i=n;i<2*n;i++)
        {
           
            ans[j]=nums[i];
             j=j+2;
             
           
            
            
            
            
        }
//         for(i=1;i<2*n;i++)
//         {
//             ans[i]=nums[i];
            
            
            
//         }
        return ans;
    }
}
class Solution {
    public boolean increasingTriplet(int[] nums) {
       if(nums.length < 3) return false;
        int i = Integer.MAX_VALUE, j =Integer.MAX_VALUE;
        for(int in = 0; in < nums.length; in++){
            if(nums[in] <= i){
                i =nums[in];
            }
            else if(nums[in] <= j){
                j = nums[in];
            }
            else return true;
        }
        return false;
            
        // }
        // return false;
        
    }
}
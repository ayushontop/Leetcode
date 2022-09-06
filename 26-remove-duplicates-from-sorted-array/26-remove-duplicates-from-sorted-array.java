class Solution {
    public int removeDuplicates(int[] nums) {
        
       int left = 1;
        if (nums.length == 0) return 0;
        for (int i = 1; i < nums.length; i++){
            if (nums[i] == nums[i-1]) continue;
            else nums[left++] = nums[i];
        }
        return left;
    }
}
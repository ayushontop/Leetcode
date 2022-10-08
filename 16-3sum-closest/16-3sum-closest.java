class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            int l = i + 1;
            int r = nums.length - 1;
            while(l < r) {
                int sum = nums[i] + nums[l] + nums[r];
                if(sum == target) return sum;
                if(Math.abs(target - sum) < Math.abs(target - result)) {
                    result = sum;
                } 
                if(sum > target) {
                    r--;
                } else {
                    l++;
                }
            }
        }
        return result;
        
    }
}
class Solution {
    public int search(int[] nums, int target) {
        int start=0;
        int end=nums.length-1;
        while(start<=end)
        {
            int mid=(start+end)/2;
            if(nums[mid]>target) end=mid-1;
            else if(target>nums[mid]) start=mid+1;
            else if(nums[mid]==target) return mid;
            // System.out.println(mid);
        }
        return -1;
        
    }
}
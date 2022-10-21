class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
       
    HashMap<Integer,Integer> m = new HashMap<>();
    for(int i=0;i<nums.length;i++){

        if(m.containsKey(nums[i])==true && Math.abs(m.get(nums[i]) - i)<=k){
        return true;
    }
        else{
            m.put(nums[i],i);
        }
    }
    return false;
    
        
    }
}